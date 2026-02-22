package com.example.Ecommerce.Repository;

import com.example.Ecommerce.Model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mobilerepo extends JpaRepository<Mobile,Integer> {
}
