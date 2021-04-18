package com.example.demo.repository;

import com.example.demo.entity.CartInfo;
import com.example.demo.projection.CustomCartInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cartInfo", collectionResourceRel = "cartInfoList", excerptProjection = CustomCartInfo.class)
public interface CartInfoRepository extends JpaRepository<CartInfo, Integer> {


}
