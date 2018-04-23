package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Orders;
import com.spring.cart.springbootcart.entity.OrdersDetils;
import com.spring.cart.springbootcart.entity.Product;
import com.spring.cart.springbootcart.model.OrdersModel;
import com.spring.cart.springbootcart.repository.OrdersDetilsRepository;
import com.spring.cart.springbootcart.repository.OrdersRepository;
import com.spring.cart.springbootcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class OrdersDaoImpl implements OrdersDao {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrdersDetilsRepository ordersDetilsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Orders createdOrders(OrdersModel ordersModel) {
        Orders orders = null;
        Product product = null;
        int idorders = ordersModel.getIdorders();
        boolean valid = false;

        if(idorders == 0){
            orders = new Orders();
            valid = true;
        }

        orders.setTanggalOrders(new Date());
        orders.setAmount(ordersModel.getAmount());
        orders.setOrdersAddress(ordersModel.getOrdersAddress());
        orders.setOrdersEmail(ordersModel.getOrdersEmail());
        orders.setOrdersName(ordersModel.getOrdersName());
        orders.setOrdersPhone(ordersModel.getOrdersPhone());
        ordersRepository.save(orders);

        List<OrdersDetils> ordersDetils = ordersModel.getOrdersDetils();
        for(OrdersDetils detils: ordersDetils){

            OrdersDetils getOrders = new OrdersDetils();
            getOrders.setOrders(orders);
            getOrders.setAmount(detils.getAmount());
            getOrders.setPrice(detils.getPrice());
            getOrders.setQuantity(detils.getQuantity());
            String idproduct = detils.getProduct().getIdproduct();
            Product productid = productRepository.findByIdproduct(idproduct);
            getOrders.setProduct(productid);

            ordersDetilsRepository.save(getOrders);
        }
        return orders;
    }

    @Override
    public List<Orders> listOrders() {
        List<Orders> ordersList = new ArrayList<>();
        for(Orders orders : ordersRepository.findAll()){
            ordersList.add(orders);
        }
        return ordersList;
    }

    @Override
    public Orders findIdorders(int idorders) {
        return null;
    }
}
