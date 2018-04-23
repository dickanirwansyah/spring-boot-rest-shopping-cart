package com.spring.cart.springbootcart.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@Table(name = "tabel_orders")
public class Orders implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idorders;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_orders", nullable = false)
    private Date tanggalOrders;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "orders_name", nullable = false)
    private String ordersName;

    @Column(name = "orders_email", nullable = false)
    private String ordersEmail;

    @Column(name = "orders_phone", nullable = false)
    private String ordersPhone;

    @Column(name = "orders_address", nullable = false)
    private String ordersAddress;

}
