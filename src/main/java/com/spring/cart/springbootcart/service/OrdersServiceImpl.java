package com.spring.cart.springbootcart.service;

import com.spring.cart.springbootcart.dao.OrdersDao;
import com.spring.cart.springbootcart.entity.Orders;
import com.spring.cart.springbootcart.model.OrdersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public Orders createdOrders(OrdersModel ordersModel) {
        return ordersDao.createdOrders(ordersModel);
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersDao.listOrders();
    }
}
