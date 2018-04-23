package com.spring.cart.springbootcart.service;

import com.spring.cart.springbootcart.dao.CategoryDao;
import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category createdCategory(CategoryModel category) {
        return categoryDao.createdCategory(category);
    }

    @Override
    public List<Category> listCategory() {
        return categoryDao.listCategory();
    }
}
