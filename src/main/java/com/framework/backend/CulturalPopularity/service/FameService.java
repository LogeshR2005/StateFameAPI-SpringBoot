package com.framework.backend.CulturalPopularity.service;


import com.framework.backend.CulturalPopularity.model.Fame;
import com.framework.backend.CulturalPopularity.repo.FameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FameService {


    @Autowired
    private FameRepo repo;


    public Fame addFame(Fame fame){
        fame.setId(UUID.randomUUID().toString().split("-")[0]);
        return  repo.save(fame);
    }

    public List<Fame> findAllFame(){
       return repo.findAllByOrderByRatingDesc();
    }

    public Fame get(String state,String district){
        return repo.findByStateAndDistrict(state,district);
    }

//    public void deleteFame(String district){
//        repo.deleteByDistrict(district);
//
//    }









}
