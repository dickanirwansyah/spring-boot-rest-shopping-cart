package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.model.CategoryModel;
import com.spring.cart.springbootcart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class CategoryDaoImpl implements CategoryDao{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createdCategory(CategoryModel category) {
        String idcategory = category.getIdcategory();
        boolean valid = false;
        Category entityCategory = null;

        if(idcategory == null){
            entityCategory = new Category();
            valid = true;
        }
        entityCategory.setName(category.getName());
        entityCategory.setDescription(category.getDescription());
        categoryRepository.save(entityCategory);
        return entityCategory;
    }

    @Override
    public List<Category> listCategory() {
        List<Category> listCategory = new ArrayList<>();
        for(Category category : categoryRepository.findAll()){
            listCategory.add(category);
        }
        return listCategory;
    }

    @Override
    public Category findIdcategory(String idcategory) {
        return null;
    }

    @Override
    public Category updatedCategory(CategoryModel category) {
        return null;
    }
}
