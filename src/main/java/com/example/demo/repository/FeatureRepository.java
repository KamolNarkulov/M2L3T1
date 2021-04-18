package com.example.demo.repository;

import com.example.demo.entity.Feature;
import com.example.demo.projection.CustomFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "feature", collectionResourceRel = "featureList", excerptProjection = CustomFeature.class)
public interface FeatureRepository extends JpaRepository<Feature, Integer> {


}
