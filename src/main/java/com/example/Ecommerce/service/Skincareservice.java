package com.example.Ecommerce.service;

import com.example.Ecommerce.Model.Skincare;
import com.example.Ecommerce.Repository.Skincarerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Skincareservice {
    @Autowired
    Skincarerepo skincarerepo;
    public List<Skincare> getall() {
        return skincarerepo.findAll();

    }

    public void add(Skincare skincare) {
        skincarerepo.save(skincare);
    }

    public Skincare getid(int id) {
        return skincarerepo.findById(id).orElse(new Skincare());
    }
}
