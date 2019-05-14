package com.guc.pattern.pattern;

import com.guc.pattern.entity.Product;

/**
 * 建造者模式
 */
public class ProductBuilder {
    private String name;
    private String category;
    private float price;
    public ProductBuilder(){
        this.name = "unknown";
        this.category = "unknown";
        this.price = -1;
    }
    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }
    public ProductBuilder setCategory(String category){
        this.category = category;
        return this;
    }
    public ProductBuilder setPrice(float price){
        this.price = price;
        return this;
    }
    public Product build(){
        Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        return product;
    }
}
