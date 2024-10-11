package com.example.Aspect.Oriented.Programming.Controllers;

import com.example.Aspect.Oriented.Programming.Entities.Product;
import com.example.Aspect.Oriented.Programming.Repostitories.ProductRepository;
import com.example.Aspect.Oriented.Programming.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add")
    public String add() {
        this.productService.save(Product.builder().productName("Laptop").productPrice("700$").build());
        return "Product Created";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        this.productService.deleteAll();
        return "All Products Deleted";
    }

}
