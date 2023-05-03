package com.example.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @PostMapping("/api/cart")
    public void addToCart(@RequestBody Product product) {
        System.out.println("Product added to cart: " + product.getName());
    }


}
class Product {
    private long id;
    private String name;
    private double price;

    // Getters and setters for id, name, and price

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
