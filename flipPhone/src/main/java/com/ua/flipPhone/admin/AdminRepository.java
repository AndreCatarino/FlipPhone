package com.ua.flipPhone.admin;


import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByEmail(String email);
}