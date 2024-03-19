package com.huike.product.controller;

import com.huike.product.entity.Product;
import com.huike.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return  product;
    }
}
