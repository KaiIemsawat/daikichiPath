package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@GetMapping("")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/{act}/{value}")
	public String location(@PathVariable("act") String act, @PathVariable("value") String value) {
		
		if (act.equals("travel")) {
			return "Congratulations! You will soon travel to " + value;
		}
		else {
			boolean isEvent = (int) Integer.parseInt(value)%2 == 0;
			if (isEvent) {
				return "You will take a grand journey in the near future, but be wary of tempting offers";
			}
			else return "You have enjoyed the fruits of your labor but now is a great time to spend time with your family and friends";
		}
		
		
	}
	

	
}
