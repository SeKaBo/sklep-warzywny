package com.example.sklepwarzywny.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("products")
public class ProductsController {

    private final ProductsService products;

    @Autowired
    public ProductsController(ProductsService products) {
        this.products = products;
    }


    @GetMapping
    public ModelAndView getAllProducts() {
        List<Product> allProducts = products.getAll();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : allProducts) {
            productDtos.add(new ProductDto(product.getId(), product.getName(), product.getPrice()));
        }
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("products", productDtos);
        return modelAndView;

    }


    @PostMapping
    public ModelAndView createProducts(@ModelAttribute("product") ProductDto productDto) {
        List<Product> allProducts = products.addDefaultProducts();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : allProducts) {
            productDtos.add(new ProductDto(product.getId(), product.getName(), product.getPrice()));
        }
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("products", productDtos);
        return modelAndView;
    }

    //    }
//
    @PostMapping("cart/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") Long id) {
        products.remove(id);
        Map<String, Object> data = new HashMap<>();
        data.put("products", products.getAll());
        return new ModelAndView("redirect: cart");
    }
}
