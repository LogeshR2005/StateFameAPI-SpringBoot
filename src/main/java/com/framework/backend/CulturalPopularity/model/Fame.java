package com.framework.backend.CulturalPopularity.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fame")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fame {

    @Id
    private String id;
    private String state;
    private String district;
    private int rating;
    private String famousFor;
    private String description;

}
