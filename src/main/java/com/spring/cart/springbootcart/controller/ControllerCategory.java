package com.spring.cart.springbootcart.controller;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.model.CategoryModel;
import com.spring.cart.springbootcart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/category")
public class ControllerCategory {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> listCategory(){
        return Optional.ofNullable(categoryService.listCategory())
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Category>>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value = "/created")
    public ResponseEntity<Category> createdCategory(@RequestBody CategoryModel category){
        return Optional.ofNullable(categoryService.createdCategory(category))
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.CREATED))
                .orElse(new ResponseEntity<Category>(HttpStatus.BAD_REQUEST));
    }
}
