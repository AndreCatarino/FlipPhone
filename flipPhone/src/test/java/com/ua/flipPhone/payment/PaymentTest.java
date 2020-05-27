package com.ua.flipPhone.payment;

import com.ua.flipPhone.order.Order;
import com.ua.flipPhone.user.User;
import com.ua.flipPhone.user.UserType;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    
    private Payment payment;
    
    private Order order;
    
    private User client;
    
    private User seller;
    
    public PaymentTest(){}
    
    @BeforeEach
    public void setUp() {
        client = new User("password", "João", "adfqewrewq", "joao@email.com", "Porto", "52346134", UserType.CLIENT);
        order = new Order(1, new Date(), 400, client);
        seller = new User("password", "Joana", "sadfwv", "joana@email.com", "Faro", "5687687468", UserType.SELLER);
        payment = new Payment(1, PaymentStatus.PENDING, PaymentGateway.CREDIT_CARD, new Date(), order,  client, seller);
    }
    
    @AfterEach
    public void tearDown() {
        payment = null;
        order = null;
        client = null;
        seller = null;
    }
    
    @Test
    public void testGetPayment_id(){
        assertEquals(1, payment.getPayment_id());
    }
    
    @Test
    public void testGetStatus(){
        assertEquals(PaymentStatus.PENDING, payment.getStatus());
    }
    
    @Test
    public void testGetGateway(){
        assertEquals(PaymentGateway.CREDIT_CARD, payment.getGateway());
    }
    
    @Test
    public void testGetDate(){
        assertEquals(new Date(), payment.getDate());
    }
    
    @Test
    public void testGetOrder_id(){
        assertEquals(order, payment.getOrder_id());
    }
    
    @Test
    public void testGetClient_id(){
        assertEquals(client, payment.getClient_id());
    }
    
    @Test
    public void testGetSeller_id(){
        assertEquals(seller, payment.getSeller_id());
    }
    
    @Test
    public void testSetPayment_id(){
        payment.setPayment_id(2);
        assertEquals(2, payment.getPayment_id());
    }
    
    @Test
    public void testSetStatus(){
        payment.setStatus(PaymentStatus.SENT);
        assertEquals(PaymentStatus.SENT, payment.getStatus());
    }
    
    @Test
    public void testSetGateway(){
        payment.setGateway(PaymentGateway.MBWAY);
        assertEquals(PaymentGateway.MBWAY, payment.getGateway());
    }
    
    @Test
    public void testSetDate(){
        Date d = new Date();
        payment.setDate(d);
        assertEquals(d, payment.getDate());
    }
    
    @Test
    public void testSetOrder_id(){
        User client = new User("password", "Joana", "afwwefwQEF", "joana@email.com", "Cucujães", "2544748", UserType.CLIENT);
        Order o;
        o = new Order(new Date(), 500, client);
        payment.setOrder_id(o);
        assertEquals(o, payment.getOrder_id());
    }
    
    @Test
    public void testSetClient_id(){
        User c = new User("password", "Rafaela", "sdfgdgf", "rafeale@email.com", "Braga", "6789968574", UserType.CLIENT);
        payment.setClient_id(c);
        assertEquals(c, payment.getClient_id());
    }
    
    @Test
    public void testSetSeller_id(){
        User s = new User("password", "Joaquim", "adsfqe", "joaquim@email.com", "Coimbra", "14447747", UserType.SELLER);
        payment.setSeller_id(s);
        assertEquals(s, payment.getSeller_id());
    }
}