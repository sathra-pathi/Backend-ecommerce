package com.example.Ecommerce.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skincare {
    @Id
    private  int id;
    private String name;
    private int price;
    private String image;
    private String brand;
    private String model;



}
