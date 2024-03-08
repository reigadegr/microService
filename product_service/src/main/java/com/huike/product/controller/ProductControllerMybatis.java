package com.huike.product.controller;

import com.huike.product.entity.ProductMy;
import com.huike.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//允许跨域访问
@CrossOrigin(origins = "*")
@RestController
public class ProductControllerMybatis {
    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/pm/{id}", method = RequestMethod.GET)
    public ProductMy findByAdminIdAndPassword(@PathVariable Long id) {
//        Long id = product.getId();
        System.out.println("你的id=" + id);
        return productService.findByAdminIdAndPassword(id);
    }
}
