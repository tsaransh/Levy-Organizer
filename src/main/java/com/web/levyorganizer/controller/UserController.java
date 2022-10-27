package com.web.levyorganizer.controller;

import com.web.levyorganizer.entity.User;
import com.web.levyorganizer.services.UserServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserServicesInterface userServicesInterface;

    @Autowired
    public UserController(UserServicesInterface userServicesInterface) {
        this.userServicesInterface = userServicesInterface;
    }

    @GetMapping("/get/{id}")
    public Optional<User> getUserDetails(@RequestParam("id") Long id) {
        return userServicesInterface.findById(id);
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userServicesInterface.save(user);
        return "Thank you...!";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        userServicesInterface.deleteById(id);
        return "Id Deleted";
    }

    public User updateUser(@RequestParam("id") Long id, @RequestBody User user) {
        return userServicesInterface.updateById(id,user);
    }

}
