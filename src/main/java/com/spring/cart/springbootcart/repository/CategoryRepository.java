package com.spring.cart.springbootcart.repository;

import com.spring.cart.springbootcart.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
