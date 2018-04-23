package com.spring.cart.springbootcart.dao;

import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.entity.Product;
import com.spring.cart.springbootcart.model.ProductModel;
import com.spring.cart.springbootcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product insertProduct(ProductModel productModel) {
        String idproduct = productModel.getIdproduct();
        boolean valid = false;
        Product product = null;

        if(idproduct == null){
            product = new Product();
            valid = true;
        }

        product.setCreatedate(new Date());
        product.setValid(true);
        product.setName(productModel.getName());
        product.setCategory(productModel.getCategory());
        product.setDescription(productModel.getDescription());
        product.setQuantity(productModel.getQuantity());
        product.setPrice(productModel.getPrice());
        productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> listProduct() {
        List<Product> products = new ArrayList<>();
        for(Product product : productRepository.findAll()){
            products.add(product);
        }
        return products;
    }

    @Override
    public Product updateProduct(ProductModel productModel) {
        String idproduct = productModel.getIdproduct();
        boolean valid = false;
        Product product = null;

        if(idproduct != null){
            product = productRepository.findByIdproduct(idproduct);
            valid = true;
        }

        product.setIdproduct(productModel.getIdproduct());
        product.setName(productModel.getName());
        product.setCategory(productModel.getCategory());
        product.setQuantity(productModel.getQuantity());
        product.setPrice(productModel.getPrice());
        product.setCreatedate(productModel.getCreatedate());
        product.setValid(productModel.isValid());
        productRepository.save(product);
        return product;
    }

    @Override
    public Product findIdproduct(String idproduct) {
        return productRepository.findByIdproduct(idproduct);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    /**
    @Override
    public List<Product> finByCategory(Category category) {
       List<Product> products = new ArrayList<>();
       for(Product product : productRepository.findByCategory(category.getName())){
            products.add(product);
       }
       return products;
    }
     **/

    @Override
    public Product findByValid(boolean valid) {
        return productRepository.findByValid(true);
    }
}
