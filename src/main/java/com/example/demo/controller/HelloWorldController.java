package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @GetMapping("/messege")
	public String getMessege() {	
      return "hello2-world2-bengaluru";
	}

}
