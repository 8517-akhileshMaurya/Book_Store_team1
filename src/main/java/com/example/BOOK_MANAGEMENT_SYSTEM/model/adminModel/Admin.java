package com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long admin_id;
    private String username;
    private String password;
    private String email;
    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now() ;


    public Admin() {
    }
}
