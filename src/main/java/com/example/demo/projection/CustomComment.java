package com.example.demo.projection;

import com.example.demo.entity.Comment;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    Integer getCustomer();

    String getMessage();

    Date getDate();

    double getMark();

    Integer getProduct();

}
