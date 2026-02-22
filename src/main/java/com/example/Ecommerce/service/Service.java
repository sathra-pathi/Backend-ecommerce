package com.example.Ecommerce.service;


import com.example.Ecommerce.Model.Products;
import com.example.Ecommerce.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repo repo;
  private final   String path="D://images/";

    public Products add(String name, MultipartFile multipartFile) throws IOException {
//            create folder
        Files.createDirectories(Paths.get(path));
//        Full file path
        String finalpath=path+multipartFile.getOriginalFilename();

//        Save image in folder
        Files.write(Paths.get(finalpath),multipartFile.getBytes());

        Products products=new Products();
        products.setName(name);
        products.setImage(multipartFile.getOriginalFilename());
       return repo.save(products);
    }

    public List<Products> getdata() {
        return repo.findAll();
    }


    public Products add2(String name, String image,String link) {
        Products products=new Products();
        products.setName(name);
        products.setImage(image);
        products.setLink(link);
        return repo.save(products);
    }
}
