package com.spring.cart.springbootcart.model;

import com.spring.cart.springbootcart.entity.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrdersDetilsModel {

    private Product product;
    private int quantity;
    private int price;
    private int amount;

}
