package com.example.demo.projection;

import com.example.demo.entity.Category;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    String getDescription();

    Integer getParentCategory();

    Integer getPhoto();

}
