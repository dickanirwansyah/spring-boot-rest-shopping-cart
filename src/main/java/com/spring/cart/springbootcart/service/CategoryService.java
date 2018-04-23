package com.spring.cart.springbootcart.service;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.model.CategoryModel;

import java.util.List;

public interface CategoryService {

    Category createdCategory(CategoryModel category);
    List<Category> listCategory();
}
