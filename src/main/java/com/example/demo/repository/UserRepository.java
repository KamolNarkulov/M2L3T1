package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "user", collectionResourceRel = "userList", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
