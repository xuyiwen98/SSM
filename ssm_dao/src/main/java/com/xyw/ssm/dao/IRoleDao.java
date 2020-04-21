package com.xyw.ssm.dao;

import com.xyw.ssm.domain.Permission;
import com.xyw.ssm.domain.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IRoleDao {

    //根据用户id查询出所有对应的角色
    @Select("select * from role where id in(select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.xyw.ssm.dao.IPermissionDao.findPermissionByRoleId")),
    })
    List<Role> findByUserId(String userId);


    //查询所有角色
    @Select("select * from role")
    List<Role> findAll();


    //新建角色
    @Insert(("insert into role (roleName,roleDesc) values (#{roleName},#{roleDesc}) "))
    void save(Role role);

    //根据roleId查询角色
    @Select("select * from role where id=#{roleId}")
    Role findById(Integer roleId);

    //
    @Select("select * from permission where id not in(select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermission(Integer roleId);

    //
    @Insert("insert into role_permission (roleId,permissionId) values (#{roleId},#{permissionId}) ")
    void addPermissionToRole(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);
}
