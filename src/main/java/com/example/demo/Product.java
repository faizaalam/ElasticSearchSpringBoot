package com.example.demo;

public class Product {
    private String name;
    private String type;
    private Double price;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Product setType(String type) {
        this.type = type;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }
}
