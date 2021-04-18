package com.example.demo.projection;

import com.example.demo.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Integer getCustomer();

    Date getDate();

    Integer getCart();
}
