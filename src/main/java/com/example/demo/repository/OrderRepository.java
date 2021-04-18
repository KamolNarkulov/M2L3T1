package com.example.demo.repository;

import com.example.demo.entity.Order;
import com.example.demo.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order", collectionResourceRel = "orderList", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {


}
