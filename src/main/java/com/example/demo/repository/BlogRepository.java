package com.example.demo.repository;

import com.example.demo.entity.Blog;
import com.example.demo.projection.CustomBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "blog", collectionResourceRel = "blogList", excerptProjection = CustomBlog.class)
public interface BlogRepository extends JpaRepository<Blog, Integer> {


}
