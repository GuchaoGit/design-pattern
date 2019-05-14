package com.guc.pattern.entity;

/**
 * 商品
 */
public class Product {
    private String name;
    private String category;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + " category = " +category + " price = "+price;
    }
}
