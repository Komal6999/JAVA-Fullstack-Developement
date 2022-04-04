package com.CICDpipeline.CICDSpringBootApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "Home Insureance RestApi!";
	}

}
