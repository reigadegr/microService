package com.huike.order.controller;

import com.huike.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        Product product = null;
        product = restTemplate.getForObject("http://127.0.0.1:9001/shop/product/2", Product.class);
        return product;
    }
}
