package com.huike.product.dao;

import com.huike.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductDao extends JpaRepository <Product,Long>, JpaSpecificationExecutor<Product> {
}
