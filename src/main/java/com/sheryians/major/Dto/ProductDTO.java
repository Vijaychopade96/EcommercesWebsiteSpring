package com.sheryians.major.Dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;

    private String name;

    private int categoryId;
    private double price;

    private double weight;
    private String Description;
    private String imageName;
}
