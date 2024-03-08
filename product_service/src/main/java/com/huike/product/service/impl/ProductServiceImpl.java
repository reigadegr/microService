package com.huike.product.service.impl;

import com.huike.product.dao.ProductDao;import com.huike.product.dao.ProductMapper;
import com.huike.product.entity.Product;
import com.huike.product.entity.ProductMy;
import com.huike.product.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductMy findByAdminIdAndPassword(Long id) {
        return productMapper.findByAdminIdAndPassword(id);
    }
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    /**
     * 保存
     *
     * @param product
     */
    @Override
    public void save(Product product) {
        productDao.save(product);
    }
    /**
     * 更新
     *
     * @param product
     */
    @Override
    public void update(Product product) {
        productDao.save(product);
    }
    /**
     * 删除
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        productDao.deleteById(id);
    }
}
