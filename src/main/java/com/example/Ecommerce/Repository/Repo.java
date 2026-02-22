package com.example.Ecommerce.Repository;


import com.example.Ecommerce.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Products,Integer> {
}
