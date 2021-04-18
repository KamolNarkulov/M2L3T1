package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.Blog;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Blog.class)
public interface CustomBlog {

    Integer getId();

    String getTitle();

    String getBody();

    List<Attachment> getPhotos();

}
