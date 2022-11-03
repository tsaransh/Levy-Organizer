package com.web.levyorganizer.dao;

import com.web.levyorganizer.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);

}
