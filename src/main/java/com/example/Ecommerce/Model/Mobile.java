package com.example.Ecommerce.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
    @Id

    private int id;
    private String name;
    private int price;
    private String image;
    private String brand;
    private String model;
    private String ram;
    private  String storage;
    private String battery;
    private String camera;
}
