package com.example.Ecommerce.controller;

import com.example.Ecommerce.Model.Products;
import com.example.Ecommerce.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin

public class Controller {
    @Autowired
    Service service;

    @PostMapping("/addimage")
    public Products getdata(@RequestParam String name,
                            @RequestParam("image") MultipartFile multipartFile) throws IOException {
        return  service.add(name,multipartFile);

    }
    @PostMapping("/add")
    public Products add2(@RequestParam String name,
                        @RequestParam String image,
                         @RequestParam String link){
        return service.add2(name,image,link);

    }
    @GetMapping("/products")
    public List<Products> getdata(){
        return service.getdata();
    }


}
