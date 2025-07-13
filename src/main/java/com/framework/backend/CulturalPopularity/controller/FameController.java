package com.framework.backend.CulturalPopularity.controller;


import com.framework.backend.CulturalPopularity.model.Fame;
import com.framework.backend.CulturalPopularity.service.FameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/fame")
public class FameController {

      @Autowired
      private FameService service;

      @PostMapping
      public Fame addFame(@RequestBody Fame fame){
          return service.addFame(fame);
      }

      @GetMapping
      public List<Fame> findAllFame(){
          return service.findAllFame();
      }

      @GetMapping("/search")
      public Fame findByStateAndDistrict(@RequestParam String state, @RequestParam String district){
          return service.get(state,district);
      }





}
