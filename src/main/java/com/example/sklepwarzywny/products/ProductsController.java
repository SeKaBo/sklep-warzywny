package com.example.sklepwarzywny.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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
    @DeleteMapping
    public ModelAndView removeProducts(@ModelAttribute("product") ProductDto productDto) {
        List<Product> allProducts = products.removeDefaultProducts();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : allProducts) {
            productDtos.remove(new ProductDto(product.getId(), product.getName(), product.getPrice()));
        }
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("products", productDtos);
        return modelAndView;
    }
}
