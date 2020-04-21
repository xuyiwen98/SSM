package com.xyw.ssm.controller;

import com.xyw.ssm.domain.Role;
import com.xyw.ssm.domain.UserInfo;
import com.xyw.ssm.service.IUserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //查找全部用户
    @RequestMapping("/findAll.do")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mv.addObject("userList", userList);
        mv.setViewName("user-list");

        return mv;
    }

    //新增用户
    @RequestMapping("/save.do")
    @PreAuthorize("authentication.principal.username=='tom'")//只有tom用户才能进行save操作
    public String save(UserInfo userInfo) {
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    //根据id查找用户
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id) {
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo=userService.findById(id);
        mv.addObject("user",userInfo);
        mv.setViewName("user-show");
        return mv;
    }

    //查询用户以及用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true) Integer userId){
        ModelAndView mv = new ModelAndView();

        //1.根据用户id查询用户

        UserInfo userInfo = userService.findById(userId);
        //2.根据用户id查询可以添加的角色
        List<Role>otherRoles=userService.findOtherRoles(userId);

        mv.addObject("user",userInfo);
        mv.addObject("roleList",otherRoles);
        mv.setViewName("user-role-add");
        return mv;
    }

    //给用户添加角色
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId",required = true) Integer userId,
                                @RequestParam(name = "ids",required = true) Integer[]roleIds){
        userService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";

    }
}
