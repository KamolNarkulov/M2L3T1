package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstname();

    String getLastname();

    String getEmail();

    String getPhoneNumber();

    Attachment getPhoto();
}
