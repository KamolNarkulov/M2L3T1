package com.example.demo.repository;

import com.example.demo.entity.Cart;
import com.example.demo.projection.CustomCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "cart", collectionResourceRel = "cartList", excerptProjection = CustomCart.class)
public interface CartRepository extends JpaRepository<Cart, Integer> {


}
