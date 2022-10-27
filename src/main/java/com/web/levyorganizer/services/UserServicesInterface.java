package com.web.levyorganizer.services;

import com.web.levyorganizer.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServicesInterface {

    public List<User> findAll();

    public Optional<User> findById(long theId);

    public void save(User theId);

    public void deleteById(long theId);

    public User updateById(long theId, User theUser);

}
