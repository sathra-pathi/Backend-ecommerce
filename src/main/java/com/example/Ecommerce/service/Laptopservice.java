package com.example.Ecommerce.service;


import com.example.Ecommerce.Model.Laptop;
import com.example.Ecommerce.Repository.Laptoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Laptopservice {
   @Autowired
     private Laptoprepo laptoprepo;

    public  Laptop getid(int id) {
        return laptoprepo.findById(id).orElse(new Laptop());
    }

    public List<Laptop> get() {
        return laptoprepo.findAll();
    }

    public void addlaptop(Laptop laptop) {
        laptoprepo.save(laptop);
    }
}
