package com.huike.product.dao;

import com.huike.product.entity.ProductMy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM tb_product WHERE id = #{id}")
    ProductMy findByAdminIdAndPassword(@Param("id") Long id);
}
