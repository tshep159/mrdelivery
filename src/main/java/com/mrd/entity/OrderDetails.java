/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrd.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */

@Entity
@Table(name="orderDetails")
public class OrderDetails implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="orderDetailsId")
    private Long orderDetailsId;
    @Column(name="user_id")
    private String user_id;
    
   @Column(name="status")
    private String status= "pending";
    @Column(name="type")
    private String type="delivery"  ;
    
    @Column(name="DATE_CREATED",nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateCreated;
    
   
    @Column(name="price")
    private double price;
    @Column(name="name")
     private String name;
    @Column(name="cardHoler")
    private String holder;
    
    @Column(name="cardNumber")
    private String number;
    
    @Column(name="expDate")
    private String exp;
    
    @Column(name="cvv")
    private String cvv; 
    @OneToMany(mappedBy="orderDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Product> product;
//    @ManyToOne()
//    private Address address;
//    
    public OrderDetails() {
    }

    public OrderDetails(Long orderDetailsId, String user_id, Date dateCreated, double price, String name, String holder, String number, String exp, String cvv, List<Product> product) {
        this.orderDetailsId = orderDetailsId;
        this.user_id = user_id;
        this.dateCreated = dateCreated;
        this.price = price;
        this.name = name;
        this.holder = holder;
        this.number = number;
        this.exp = exp;
        this.cvv = cvv;
        this.product = product;
    }

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    
    
    }
