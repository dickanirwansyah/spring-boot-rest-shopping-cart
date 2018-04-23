package com.spring.cart.springbootcart.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@Entity
@Table(name = "tabel_orders_detil")
public class OrdersDetils implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iorders_detil;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idorders", nullable = false)
    private Orders orders;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idproduct", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "amount", nullable = false)
    private int amount;
}
