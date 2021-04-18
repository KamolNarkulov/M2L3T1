package com.example.demo.projection;

import com.example.demo.entity.Cart;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Cart.class)
public interface CustomCart {

    Integer getId();

    Integer getCustomer();

    Date getCreatedDate();

}
