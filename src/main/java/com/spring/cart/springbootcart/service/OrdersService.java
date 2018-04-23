package com.spring.cart.springbootcart.service;

import com.spring.cart.springbootcart.entity.Orders;
import com.spring.cart.springbootcart.model.OrdersModel;

import java.util.List;

public interface OrdersService {

    Orders createdOrders(OrdersModel ordersModel);
    List<Orders> findAllOrders();
}
