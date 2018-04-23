package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.model.CategoryModel;

import java.util.List;

public interface CategoryDao {

    Category createdCategory(CategoryModel category);
    List<Category> listCategory();
    Category findIdcategory(String idcategory);
    Category updatedCategory(CategoryModel category);
}
