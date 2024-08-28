package com.example.BOOK_MANAGEMENT_SYSTEM.Service.adminservice;


import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;

public interface AdminService {
    void registerAdmin(Admin admin);
    boolean authenticateAdmin(String username, String password);
}