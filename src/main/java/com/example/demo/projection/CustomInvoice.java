package com.example.demo.projection;

import com.example.demo.entity.Invoice;
import org.springframework.data.rest.core.config.Projection;


import java.util.Date;

@Projection(types = Invoice.class)
public interface CustomInvoice {

    Integer getId();

    Integer getCustomer();

    Integer getOrder();

    double getPrice();

    Date getCreatedDate();

    Date getDueDate();

    Integer getOrderStatus();
}
