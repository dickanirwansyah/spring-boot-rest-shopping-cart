package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.entity.Product;
import com.spring.cart.springbootcart.model.ProductModel;

import java.util.List;

public interface ProductDao {

    Product insertProduct(ProductModel productModel);
    List<Product> listProduct();
    Product updateProduct(ProductModel productModel);
    Product findIdproduct(String idproduct);
    Product findByName(String name);
    Product findByValid(boolean valid);
}
