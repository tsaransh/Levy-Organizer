package com.web.levyorganizer.services;

import com.web.levyorganizer.dao.UserRepo;
import com.web.levyorganizer.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices implements UserServicesInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserInfo> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<UserInfo> findById(long theId) {
        return userRepo.findById(theId);
    }

    @Override
    public UserInfo loadByUsername(String username) {
        return (userRepo.findByUsername(username));
    }

    @Override
    public UserInfo save(UserInfo user) {
        UserInfo theUserInfo =  userRepo.save(user);
        return theUserInfo;
    }

    @Override
    public void deleteById(long theId) {
        userRepo.deleteById(theId);
    }

    @Override
    public UserInfo updateById(long theId, UserInfo theUser) {
        Optional<UserInfo> user = findById(theId);

        return null;
    }

    @Override
    public String createPersonalDashboard(String tblName) {
        return null;
    }

}
