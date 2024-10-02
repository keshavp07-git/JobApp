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
}
