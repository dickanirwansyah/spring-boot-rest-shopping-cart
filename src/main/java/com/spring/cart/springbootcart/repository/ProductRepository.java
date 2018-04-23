package com.spring.cart.springbootcart.repository;
import com.spring.cart.springbootcart.entity.Category;
import com.spring.cart.springbootcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Query
    Product findByIdproduct(String idproduct);

    @Query
    Product findByName(String name);

    @Query
    List<Product> findByCategory(String category);

    @Query
    Product findByValid(boolean valid);
}
