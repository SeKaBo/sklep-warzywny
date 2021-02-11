package com.example.sklepwarzywny.cart;

import com.example.sklepwarzywny.products.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private List<Product> itemsList = new ArrayList<>();

    public List<Product> addToCart(Product product) {
        itemsList.add(product);
        return this.itemsList;

    }

    public List<Product> removeFromCart(Product product) {
        itemsList.remove(product);
        return this.itemsList;

    }

    public List<Product> getCartState() {

        return itemsList;
    }
}


