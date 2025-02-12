package com.willowridge.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	@GetMapping("/greetings")
    public String getGreetings() {
    	
    	return "Greetings";
    }
}
