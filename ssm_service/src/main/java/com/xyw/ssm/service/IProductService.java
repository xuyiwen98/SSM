package com.xyw.ssm.service;

import com.xyw.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);
}
