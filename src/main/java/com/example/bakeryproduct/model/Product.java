package com.example.bakeryproduct.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String quantity;
    @Enumerated
    private Type type;
    private String price;
    private String Description;
    private String  amount;
    private String dateOfExpiry;
    private String manufacturingDate;
}
