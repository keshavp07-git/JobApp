package com.keshav.JobApp.repo;

import com.keshav.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Dev","Good",2, Collections.singletonList("Java")),
            new JobPost(2,"Go Dev","Good",3, Collections.singletonList("Go Lang")),
            new JobPost(3,"Kotlin","Good",5, Collections.singletonList("Android"))
    ));
    // This is the repo where all data is saved or can say List which working as a database.
    // All required details fetching from JobPost which is data class (lombok constructor).
    //Selecting one tech stack that is why converting to singleton list here.


    public List<JobPost> getAllJobs(){ // We created a method getAllJobs which return ,
        return jobs;                   // All jobs from List and its type is List<JobPost.>
    }
    public void addJob(JobPost job){ // This wrap all job details that is to be added wrap in job
        jobs.add(job);               // object and added to repo layer
        System.out.println(jobs);
    }
}
