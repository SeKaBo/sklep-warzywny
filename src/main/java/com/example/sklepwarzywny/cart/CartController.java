package com.example.sklepwarzywny.cart;

import com.example.sklepwarzywny.products.Product;
import com.example.sklepwarzywny.products.ProductDto;
import com.example.sklepwarzywny.products.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("cart")
public class CartController {

    private final CartService cartService;
    private final ProductsService productsService;

    @Autowired
    public CartController(CartService cartService, ProductsService productsService) {
        this.cartService = cartService;
        this.productsService = productsService;
    }

    @GetMapping
    public ModelAndView displayCart() {
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("products", asDtos(cartService.getCartState()));
        return modelAndView;
    }

    @PostMapping("add")
    public ModelAndView addToCart(@ModelAttribute("productId") Long productId) {
        Product product = productsService.getById(productId);
        List<Product> cartProducts = cartService.addToCart(product);
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("products", asDtos(cartProducts));
        return modelAndView;
    }

    private List<ProductDto> asDtos(List<Product> products) {
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : products) {
            productDtos.add(new ProductDto(product.getId(), product.getName(), product.getPrice()));
        }
        return productDtos;
    }

// wartość koszyka

// usuwanie z koszyka


    @DeleteMapping("delete")
    public ModelAndView removeFromCart(@ModelAttribute("productId") Long productId) {
        Product product = productsService.getById(productId);
        List<Product> cartProducts = cartService.removeFromCart(product);
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("products", asDtos(cartProducts));
        return modelAndView;
//
    }
}


