package com.spring.cart.springbootcart.controller;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.entity.Product;
import com.spring.cart.springbootcart.model.ProductModel;
import com.spring.cart.springbootcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/product")
public class ControllerProduct {

    @Autowired
    private ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>> listProduct(){
        return Optional.ofNullable(productService.listProduct())
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST));
    }


    @PostMapping(value = "/created")
    public ResponseEntity<Product> cretedProduct(@RequestBody ProductModel productModel){
        return Optional.ofNullable(productService.insertProduct(productModel))
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.CREATED))
                .orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
    }

    @GetMapping(value = "/by")
    public ResponseEntity<Product> findByNamed(@RequestParam String name){
        return Optional.ofNullable(productService.findByName(name))
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.OK))
                .orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
    }

    @GetMapping(value = "/{idproduct}")
    public ResponseEntity<Product> findByID(@PathVariable String idproduct){
        return Optional.ofNullable(productService.findIdproduct(idproduct))
                .map(callbackJSON -> new ResponseEntity<>(callbackJSON, HttpStatus.OK))
                .orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
    }


}
