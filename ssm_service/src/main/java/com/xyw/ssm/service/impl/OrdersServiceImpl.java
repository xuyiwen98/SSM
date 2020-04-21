package com.xyw.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyw.ssm.dao.IOrdersDao;
import com.xyw.ssm.domain.Orders;
import com.xyw.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;


    @Override
    public List<Orders> findAll(int page,int size) {
        //从第1页开始,每页显示5条
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(Integer ordersId) {
        return ordersDao.findById(ordersId);
    }



}
