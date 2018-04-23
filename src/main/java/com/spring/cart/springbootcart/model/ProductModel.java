package com.spring.cart.springbootcart.model;

import com.spring.cart.springbootcart.entity.Category;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class ProductModel {

    private String idproduct;
    private Category category;
    private String name;
    private String description;
    private int quantity;
    private int price;
    private Date createdate;
    private boolean valid;
}
