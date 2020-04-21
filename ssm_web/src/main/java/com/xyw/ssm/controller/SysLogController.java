package com.xyw.ssm.controller;

import com.xyw.ssm.domain.SysLog;
import com.xyw.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private ISysLogService sysLogService;


    @RequestMapping("/findAll.do")
    public ModelAndView findAll(HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        List<SysLog> sysLogList=sysLogService.findAll();

       // response.addCookie(new Cookie("token",token));

        mv.addObject("sysLogs",sysLogList);
        mv.setViewName("syslog-list");
        return mv;
    }
}
