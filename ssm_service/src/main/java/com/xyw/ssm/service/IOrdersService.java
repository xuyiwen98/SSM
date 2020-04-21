package com.xyw.ssm.service;

import com.xyw.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page,int size);

    Orders findById(Integer ordersId);
}
