package com.devops_api.controller;


	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	@ComponentScan
	@RestController
	//@Autowired 
	public class DockerMessage {
		  @GetMapping("/messages")
		  public String getMessage() {
			  return "Hello, This is a node js Testing pages!!";
		  }
		 
		
	   
	}


