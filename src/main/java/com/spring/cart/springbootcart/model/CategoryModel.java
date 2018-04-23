package com.spring.cart.springbootcart.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CategoryModel {

    private String idcategory;
    private String name;
    private String description;
}
