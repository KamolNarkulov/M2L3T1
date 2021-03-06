package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.projection.CustomProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(path = "product" , collectionResourceRel = "productList", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @RestResource(path = "byPrice")
    Page<Product> findAllByPrice(@Param("price") double price , Pageable pageable);
}
