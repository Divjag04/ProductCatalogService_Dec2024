package org.example.productcatalogservice_dec2024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Category category;
}
