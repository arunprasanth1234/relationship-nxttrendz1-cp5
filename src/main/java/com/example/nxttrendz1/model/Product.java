/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here 

package com.example.nxttrendz1.model;

import javax.persistence.*;

@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)

    @Column(name = "productId")
    private int productId;

    @Column(name = "productName")
    private int productName;

    @Column(name = "price")
    private int price;

    private Review review;

    public Product() {
    }

    public Product(int productId, String productName, String price, Review review) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.review = review;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Review getReview() {
        return review;

    }

    public void setReview(Review review) {
        this.review = review;
    }

}