package com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdminPrinciple implements UserDetails {

    private Admin admin;
    public AdminPrinciple(Admin admin) {
        this.admin=admin;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("admin"));
    }

    @Override
    public String getPassword() {
        return admin.getAdminPassword();
    }

    @Override
    public String getUsername() {
        return admin.getAdminUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
