package com.xyw.ssm.service;

import com.xyw.ssm.domain.Role;
import com.xyw.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(Integer id);

    List<Role> findOtherRoles(Integer userId);



    void addRoleToUser(Integer userId, Integer[] roleIds);
}
