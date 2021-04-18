package com.example.demo.projection;

import com.example.demo.entity.Payment;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Payment.class)
public interface CustomPayment {

    Integer getId();

    double getPrice();

    Integer getUser();

    Integer getInvoice();

    Date getDate();

}
