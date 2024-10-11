package com.example.Aspect.Oriented.Programming.Services;

import com.example.Aspect.Oriented.Programming.Entities.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public Product save(Product product);
    public Boolean delete(Integer productId);
}
