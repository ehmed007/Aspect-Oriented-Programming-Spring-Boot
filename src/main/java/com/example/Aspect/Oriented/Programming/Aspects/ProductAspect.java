package com.example.Aspect.Oriented.Programming.Aspects;

import com.example.Aspect.Oriented.Programming.Entities.Product;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ProductAspect {

    private Logger logger = LoggerFactory.getLogger(Product.class);

    @Before("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.save(..))")
    public void runBeforeProudctAdd() {
        logger.info("Product are now going to be Added........");
    }

    @After("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.save(..))")
    public void runAfterProudctAdd() {
        logger.info("Product Added Successfully");
    }



    @Before("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.deleteAll(..))")
    public void runBeforeProudctDelete() {
        logger.error("Product are now going to be Deleted........");
    }

    @After("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.deleteAll(..))")
    public void runAfterProudctDelete() {
        logger.error("Product Deleted Successfully");
    }

}
