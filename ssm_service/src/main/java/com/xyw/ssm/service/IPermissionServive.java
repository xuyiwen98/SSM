package com.xyw.ssm.service;

import com.xyw.ssm.domain.Permission;

import java.util.List;

public interface IPermissionServive {
    public List<Permission> findAll();

    void save(Permission permission);
}
