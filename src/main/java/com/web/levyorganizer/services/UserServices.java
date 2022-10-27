package com.web.levyorganizer.services;

import com.web.levyorganizer.dao.UserRepo;
import com.web.levyorganizer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices implements UserServicesInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(long theId) {
        return userRepo.findById(theId);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteById(long theId) {
        userRepo.deleteById(theId);
    }

    @Override
    public User updateById(long theId,User theUser) {
        Optional<User> user = findById(theId);

        return null;
    }

}
