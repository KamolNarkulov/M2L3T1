package com.example.demo.projection;

import com.example.demo.entity.Feature;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Feature.class)
public interface CustomFeature {

    Integer getId();

    String getName();

    String getType();

    Integer getCategory();

}
