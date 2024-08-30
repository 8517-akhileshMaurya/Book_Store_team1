package com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long admin_id;
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "^.{6,}$", message = "Password must be more than 6 characters")
    private String password;
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String role = "Admin";


    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now() ;

    public Admin() {
    }
}
