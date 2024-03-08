package com.huike.product.service;

import com.huike.product.entity.Product;
import com.huike.product.entity.ProductMy;
import org.apache.ibatis.annotations.Param;

public interface ProductService {
    Product findById(Long id);

    ProductMy findByAdminIdAndPassword(Long id);

    void save(Product product);

    void update(Product product);

    void delete(Long id);
}
