package com.keshav.JobApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAppApplication.class, args);
	}

}
// Request created by controller to save details with service.addJob(job) method in controller save data
// Controller will contact to service layer and service perform service (add data , put data) then go to repo.
// Repo have 2 method one for add details in list and another to show  data. and according to service repo will work
// Delete ,update , Insert
