package com.example.sklepwarzywny.cart;

import com.example.sklepwarzywny.products.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartService {

    private List<Product> itemsList = new ArrayList<>();
    private Map<Long, Product> products = new HashMap<>();

    public List<Product> addToCart(Product product) {
        products.put(product.getId(), product);
        return new ArrayList<>(products.values());

    }

    public List<Product> removeFromCart(Product product) {
        products.remove(product.getId());
        return new ArrayList<>(products.values());

    }

    public List<Product> getCartState() {
        return new ArrayList<>(products.values());
    }
}


