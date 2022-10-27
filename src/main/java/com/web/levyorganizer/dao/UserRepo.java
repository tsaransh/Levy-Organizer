package com.web.levyorganizer.dao;

import com.web.levyorganizer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<User, Long> {

}
