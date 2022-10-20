package com.example.bakeryproduct.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
@Entity
public class Product {
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
