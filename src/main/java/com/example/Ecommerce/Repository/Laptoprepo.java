package com.example.Ecommerce.Repository;

import com.example.Ecommerce.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepo extends JpaRepository<Laptop,Integer> {
}
