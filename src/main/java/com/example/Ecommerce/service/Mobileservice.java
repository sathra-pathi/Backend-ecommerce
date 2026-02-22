package com.example.Ecommerce.service;


import com.example.Ecommerce.Model.Mobile;
import com.example.Ecommerce.Repository.Mobilerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mobileservice {
    @Autowired
    Mobilerepo mobilerepo;
    public List<Mobile> getall(){
        return mobilerepo.findAll();
    }
    public Mobile addmobile(Mobile mobile) {
        return mobilerepo.save(mobile);

    }

    public Mobile getid(int id) {
        return mobilerepo.findById(id).orElse(new Mobile());
    }
}
