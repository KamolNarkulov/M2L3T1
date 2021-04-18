package com.example.demo.projection;

import com.example.demo.entity.CartInfo;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = CartInfo.class)
public interface CustomCartInfo {

    Integer getId();

    Integer getProduct();

    Integer getCart();

    double getQty();
}
