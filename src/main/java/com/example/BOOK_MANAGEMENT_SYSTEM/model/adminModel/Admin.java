package com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel;

/*
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
*/


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.sql.Timestamp;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @Column(unique = true)
    @NotNull(message = "username is necessary")
    private String adminUsername;

    @NotNull(message = "email is necessary")
    private String adminEmail;

    @NotNull(message = "password is important")
    private String adminPassword;

    @NotNull
    private Timestamp created_at;

}