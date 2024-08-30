package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    private Long user_id;
    private int total_amount;
    private String order_status;

    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now() ;


}



