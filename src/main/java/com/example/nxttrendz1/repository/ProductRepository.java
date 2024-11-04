/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here  

package com.example.nxttrendz1.repository;

import java.util.*;

import com.example.nxttrendz1.model.Product;

public interface ProductRepository {

    ArrayList<Product> getProducts();

    Product getProductById(int ProductId);

    Product addProduct(Product product);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);

    // ArrayList<Review> getProductReviews();

    // Review addProductReview(Review review);

    // Review getProductReviewById(int reviewId);

    // Review updateProductReview(int reviewId, Review review);

    // void deleteProductReview(int reviewId);

}