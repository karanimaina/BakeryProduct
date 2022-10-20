package com.example.bakeryproduct.dto;

import com.example.bakeryproduct.model.Type;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Data
public class ProductDto {
    private String name;
    private String quantity;
    private Type type;
    private String price;
    private String Description;
    private String  amount;
    private String dateOfExpiry;
    private String manufacturingDate;
}
