package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "category", collectionResourceRel = "categoryList", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
