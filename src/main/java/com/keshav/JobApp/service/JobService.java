package com.keshav.JobApp.service;

import com.keshav.JobApp.model.JobPost;
import com.keshav.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){   // This is a method which add job to the another layer (List).
        repo.addJob(jobPost);             // It takes parameter and its object collect data and add it to Repo


    }
    public List<JobPost> getAllJob (){    // This return all saved data from list that we created.
        return repo.getAllJobs();         // With getAllJob method return all data before that adding and retrieving data
                                        // from repo is done by connecting service to repo by @Autowire annotation.
                                       // To perform all these we have to make Object of service layer.
    }
}
