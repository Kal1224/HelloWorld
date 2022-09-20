package com.koast.Hello;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootConfiguration
@RestController
public class TestController {

	@GetMapping("/")
	public String Hello() {
		return "HelloWorld";
	}
	

}
