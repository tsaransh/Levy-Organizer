package com.web.levyorganizer.services;

import com.web.levyorganizer.entity.UserInfo;

import java.util.List;
import java.util.Optional;

public interface UserServicesInterface {

    public List<UserInfo> findAll();

    public Optional<UserInfo> findById(long theId);

    public UserInfo loadByUsername(String username);

    public void save(UserInfo theId);

    public void deleteById(long theId);

    public UserInfo updateById(long theId, UserInfo theUser);

}
