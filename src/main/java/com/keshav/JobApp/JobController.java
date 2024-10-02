package com.keshav.JobApp;

import com.keshav.JobApp.model.JobPost;
import com.keshav.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service; // Create object of service class
    // To do processing and it to repo layer to save data in list and show to terminal.


@GetMapping ({"/","home"})
    public String home(){
    return "home";
    }
@GetMapping("addjob")
    public String addJob(){
    return "addjob";
    }
    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewJobs(Model m){   // Using Model and making of its object m to work with dummy data.
        List<JobPost> jobs = service.getAllJob(); // In a List named jobs calling all jobs to view using getAllJob() with object of service this service referring to JobService class
        m.addAttribute("jobPosts",jobs); // To see all Data from model which make using List we use Model create its object m
        //with attributeName "jobPosts" we access jobs which is working as a variable to hold all job details
        return "viewalljobs";
    }
}
