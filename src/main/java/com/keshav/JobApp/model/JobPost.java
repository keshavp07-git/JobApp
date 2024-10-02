package com.keshav.JobApp.model;


import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // This is from dependency lombok to reduce code.
//This turn this class a Data class so that getters and setters can be created.
@NoArgsConstructor // This created default constructor.
@AllArgsConstructor // This created Parameterized Constructor with getter and setter also with to string method.
@Component
public class JobPost {


    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

}
