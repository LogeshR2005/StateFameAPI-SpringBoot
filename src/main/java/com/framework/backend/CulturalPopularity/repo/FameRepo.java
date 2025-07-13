package com.framework.backend.CulturalPopularity.repo;

import com.framework.backend.CulturalPopularity.model.Fame;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FameRepo extends MongoRepository<Fame,String> {

    public Fame findByStateAndDistrict(String state,String district);
    List<Fame> findAllByOrderByRatingDesc();
    public void deleteByDistrict(String district);

}
