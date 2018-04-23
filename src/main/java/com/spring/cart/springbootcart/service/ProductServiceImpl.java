package com.spring.cart.springbootcart.service;

import com.spring.cart.springbootcart.dao.ProductDao;
import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.entity.Product;
import com.spring.cart.springbootcart.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product insertProduct(ProductModel productModel) {
        return productDao.insertProduct(productModel);
    }

    @Override
    public List<Product> listProduct() {
        return productDao.listProduct();
    }

    @Override
    public Product updateProduct(ProductModel productModel) {
        return productDao.updateProduct(productModel);
    }

    @Override
    public Product findIdproduct(String idproduct) {
        return productDao.findIdproduct(idproduct);
    }

    @Override
    public Product findByName(String name) {
        return productDao.findByName(name);
    }

  
    /**
    @Override
    public Product finByCategory(Category category) {
        return productDao.findByName(category);
    }
     **/

    @Override
    public Product findByValid(boolean valid) {
        return findByValid(valid);
    }
}
