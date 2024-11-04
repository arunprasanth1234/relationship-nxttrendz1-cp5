/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here 

package com.example.nxttrendz1.controller;

import com.example.nxttrendz1.service.ProductJpaService;
import com.example.nxttrendz1.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.*;

import com.example.nxttrendz1.model.Review;

@RestController

public class ProductController {

    @Autowired
    private ProductJpaService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/products/{productId}")
    public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable("productId") int productId) {
        productService.deleteProduct(productId);
    }

    /*
     * @GetMapping("/products/reviews")
     * public ArrayList<Review> getProductReviews() {
     * return productService.getProductReviews();
     * }
     * 
     * @PostMapping("/products/reviews")
     * public Review addProductReviews(@RequestBody Review review) {
     * return productService.addProductReview(review);
     * }
     * 
     * @GetMapping("/products/reviews/{reviewId}")
     * public Review getProductReviewById(@PathVariable("reviewId") int reviewId) {
     * return productService.getProductReviewById(reviewId);
     * }
     * 
     * @PutMapping("/products/review/{reviewId}")
     * public Review updateReview(@PathVariable("reviewId") int
     * reviewId, @RequestBody Review review) {
     * return productService.updateReview(reviewId, review);
     * }
     * 
     * @DeleteMapping("/products/review/{reviewId}")
     * public void deleteProductReview(@PathVariable("reviewId") int reviewId) {
     * productService.deleteProductReview(reviewId);
     * }
     */

}