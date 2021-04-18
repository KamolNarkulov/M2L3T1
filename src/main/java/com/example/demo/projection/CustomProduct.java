package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getDescription();

    Integer getCategory();

    double getPrice();

    List<Attachment> getPhotos();
}
