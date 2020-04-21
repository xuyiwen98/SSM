package com.xyw.ssm.service;

import com.xyw.ssm.domain.Permission;
import com.xyw.ssm.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role>findAll();

    void save(Role role);

    Role findById(Integer roleId);

    List<Permission> findOtherPermission(Integer roleId);

    void addPermissionToRole(Integer roleId, Integer[] permissionId);
}
