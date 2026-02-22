package com.example.Ecommerce.service;


import com.example.Ecommerce.Model.Shoe;
import com.example.Ecommerce.Repository.Shoerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shoeservice {
    @Autowired
    Shoerepo shoerepo;

    public List<Shoe> getall() {
        return shoerepo.findAll();
    }

    public void addshoe(Shoe shoe) {
        shoerepo.save(shoe);
    }

    public Shoe getid(int id) {
        return shoerepo.findById(id).orElse(new Shoe());
    }
}
