package com.example.Aspect.Oriented.Programming.Services;


import com.example.Aspect.Oriented.Programming.Entities.Product;
import com.example.Aspect.Oriented.Programming.Repostitories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Boolean deleteAll() {
        this.productRepository.deleteAll();
        return true;
    }
}
