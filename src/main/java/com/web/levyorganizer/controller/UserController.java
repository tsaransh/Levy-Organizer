package com.web.levyorganizer.controller;

import com.web.levyorganizer.entity.LoginEntityForUser;
import com.web.levyorganizer.entity.PersonalExpense;
import com.web.levyorganizer.entity.UserInfo;
import com.web.levyorganizer.services.PersonalExpenseInterface;
import com.web.levyorganizer.services.UserServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @Autowired
    private PersonalExpenseInterface personalExpenseInterface;


    @GetMapping("/get")
    public Optional<UserInfo> getUserDetails(@RequestParam("id") Long id) {
        return userServicesInterface.findById(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserInfo userLoginByUsername(@RequestBody LoginEntityForUser loginEntity) throws Exception {
        System.err.println(loginEntity.toString());
        try {
            UserInfo userInfo = userServicesInterface.loadByUsername(loginEntity.getUsername());
            if((userInfo.getUserPlainPassword().compareTo(loginEntity.getPassword())) == 0) {
                return userInfo;
            }
        } catch(Exception exception) {
            exception.printStackTrace();
            throw new Exception("Check the username and password");
        }
        return null;
    }

    @PostMapping("/add")
    public UserInfo addUser(@RequestBody UserInfo user) {
        UserInfo theUserInfo =  userServicesInterface.save(user);
        return theUserInfo;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        userServicesInterface.deleteById(id);
        return "Id Deleted";
    }

    public UserInfo updateUser(@RequestParam("id") Long id, @RequestBody UserInfo user) {
        return userServicesInterface.updateById(id,user);
    }

    @RequestMapping("/add-expense")
    public void addExp(@RequestBody PersonalExpense personalExpense) {
        personalExpenseInterface.addExp(personalExpense);
    }

}
