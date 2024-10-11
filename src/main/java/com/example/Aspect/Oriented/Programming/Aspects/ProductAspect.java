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

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    @Before("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.save(..))")
    public void runBeforeProudctAdd() {
        logger.info(ANSI_GREEN +"Product are now going to be Added........"+ ANSI_RESET);
    }

    @After("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.save(..))")
    public void runAfterProudctAdd() {
        logger.info(ANSI_GREEN +"Product Added Successfully"+ ANSI_RESET);
    }



    @Before("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.deleteAll(..))")
    public void runBeforeProudctDelete() {
        logger.error(ANSI_RED +"Product are now going to be Deleted........"+ ANSI_RESET);
    }

    @After("execution(* com.example.Aspect.Oriented.Programming.Services.ProductServiceImplementation.deleteAll(..))")
    public void runAfterProudctDelete() {
        logger.error(ANSI_RED +"Product Deleted Successfully"+ ANSI_RESET);
    }

}
