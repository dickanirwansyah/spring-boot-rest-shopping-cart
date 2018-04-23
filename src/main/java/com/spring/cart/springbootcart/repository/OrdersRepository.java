package com.spring.cart.springbootcart.repository;

import com.spring.cart.springbootcart.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

    @Query
    Orders findByIdorders(int idorders);

}
