package com.example.BOOK_MANAGEMENT_SYSTEM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    @OneToOne
    private Long user_id;

    private Long product_id;
    private String cartItem;
    private String password;

    private int quantity;
    @CreationTimestamp
    private Timestamp addedCart;

}


//id: Primary Key, auto-increment
//cart_id: Foreign Key (Cart), not null
//product_id: Foreign Key (Product), not null
//quantity: Integer, not null
