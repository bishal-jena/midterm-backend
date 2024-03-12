
package com.bishal.fake.cart.services;
import com.bishal.fake.cart.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);

    Product updateProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getProductsByCategory(String categoryName);
    List<String> getCategories();
}