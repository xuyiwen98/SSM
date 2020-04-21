package com.xyw.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.xyw.ssm.domain.Orders;
import com.xyw.ssm.service.IOrdersService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    //查询全部订单(未分页)
   /* @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll();
        mv.addObject("ordersList",ordersList);
        mv.setViewName("orders-list");
        return mv;
    }*/

   //查询全部订单(分页)
   @RequestMapping("/findAll.do")
   @Secured("ROLE_ADMIN")//前缀(ROLE_)不可省略
   public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")Integer page,
                               @RequestParam(name = "size",required = true,defaultValue = "4")Integer size){
       ModelAndView mv = new ModelAndView();
       List<Orders> ordersList = ordersService.findAll(page,size);
       //PageInfo就是一个分页bean
       PageInfo pageInfo = new PageInfo(ordersList);
       mv.addObject("pageInfo",pageInfo);
       mv.setViewName("orders-page-list");
       return mv;
   }

   @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)Integer ordersId){
       ModelAndView mv = new ModelAndView();
       Orders orders=ordersService.findById(ordersId);
       mv.addObject("orders",orders);
       mv.setViewName("orders-show");
       return mv;
   }

}
