package com.example.sklepwarzywny.products;

import com.example.sklepwarzywny.Utils;
import com.example.sklepwarzywny.bootstrap.BootstrapElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    private ProductsRepository productsRepository;

    @Autowired
    public ProductsService(ProductsRepository productsRepository) {

        this.productsRepository = productsRepository;
    }

    public List<Product> getAll() {
        return Utils.toList(
                productsRepository.findAll());
    }

    public Product getById(Long id) {

        return productsRepository.findById(id).get();
    }

    @PostConstruct
    public List<Product> addDefaultProducts() {
        List<Product> products = List.of(
                new Product("Carrot", 4.30),
                new Product("Apple", 5.20)
        );
        return Utils.toList(
                productsRepository.saveAll(products));
    }


    void remove(Long id) {
        Optional<Product> product = productsRepository.findById(id);
        if(product.isPresent()) {
            Product productToDelete = product.get();
            productsRepository.delete(productToDelete);
        }
    }
}
