package com.example.demo.projection;

import com.example.demo.entity.Detail;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Detail.class)
public interface CustomDetail {

    Integer getId();

    Integer getProduct();

    Integer getFeature();

    String getValue();
}
