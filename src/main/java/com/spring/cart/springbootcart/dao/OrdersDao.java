package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Orders;
import com.spring.cart.springbootcart.model.OrdersModel;

import java.util.List;

public interface OrdersDao {

    Orders createdOrders(OrdersModel ordersModel);
    List<Orders> listOrders();
    Orders findIdorders(int idorders);
}
