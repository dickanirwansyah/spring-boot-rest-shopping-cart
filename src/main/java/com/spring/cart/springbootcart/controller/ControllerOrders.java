package com.spring.cart.springbootcart.controller;

import com.spring.cart.springbootcart.entity.Orders;
import com.spring.cart.springbootcart.model.OrdersModel;
import com.spring.cart.springbootcart.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/orders")
public class ControllerOrders {

    @Autowired
    private OrdersService ordersService;

    @GetMapping
    public ResponseEntity<List<Orders>> listOrders(){
        return Optional.ofNullable(ordersService.findAllOrders())
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Orders>>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value = "/created")
    public ResponseEntity<Orders> createdOrders(@RequestBody OrdersModel ordersModel){
        return Optional.ofNullable(ordersService.createdOrders(ordersModel))
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.CREATED))
                .orElse(new ResponseEntity<Orders>(HttpStatus.BAD_REQUEST));
    }

}
