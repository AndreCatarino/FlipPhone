package com.ua.flipPhone.payment;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}