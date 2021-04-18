package com.example.demo.repository;

import com.example.demo.entity.Detail;
import com.example.demo.projection.CustomDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "detail", collectionResourceRel = "detailList", excerptProjection = CustomDetail.class)
public interface DetailRepository extends JpaRepository<Detail, Integer> {


}
