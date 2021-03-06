/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrd.service;

import com.mrd.entity.Product;
import com.mrd.entity.User;
import com.mrd.repository.ProductRepository;
import com.mrd.repository.UserRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LebyanaWT
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository prodRep;
    @Autowired
    private UserRepository userRepository;
    public List<Product> listProducts(){
        List<Product> allProducts = new ArrayList<>();
        prodRep.findAll().forEach(allProducts::add);
        return allProducts;
    }
    
    public void addProduct(Product prod){
       
//        Product pro = new Product();
//        pro.setUser(prod.getUser());
//        pro.setName(prod.getName());
//        pro.setDescription(prod.getDescription());
//        pro.setPrice(prod.getPrice());

        prodRep.save(prod);
    }
    
    public void removeProd(Product prod){
        prodRep.delete(prod);
    }

 public List <Product> listProduct(int user_id) {
  
  return (List<Product>) prodRep.findProductByUser(user_id);
  
    }

 
    public String save(int product_id, Product product) {
    Product p = prodRep.findOne(product_id);
   // p.setActive(product.getActive());
    p.setDescription(product.getDescription());
    p.setImage(product.getImage());
    p.setName(product.getName());
    p.setPrice(product.getPrice());
    prodRep.save(p);
    return "success";
    }


 
 
 
 
}
