package com.huike.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductMy {
    private Long id;
    private String product_name;
    private Integer status;
    private BigDecimal price;
    private String product_desc;
    private String caption;
    private Integer inventory;
}
