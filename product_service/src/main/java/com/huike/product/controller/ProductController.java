package com.huike.product.controller;

import com.huike.product.entity.Product;
import com.huike.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
//允许跨域访问
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {

        try {
            return productService.findById(id);
        } catch (Exception e) {
            System.out.println("有异常");
        }

        return null;
    }
}
