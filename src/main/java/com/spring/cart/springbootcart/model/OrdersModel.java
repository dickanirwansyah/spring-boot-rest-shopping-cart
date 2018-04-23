package com.spring.cart.springbootcart.model;

import com.spring.cart.springbootcart.entity.OrdersDetils;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class OrdersModel {

    private int idorders;
    private String ordersName;
    private String ordersEmail;
    private String ordersPhone;
    private String ordersAddress;
    private int amount;
    private List<OrdersDetils> ordersDetils;

}
