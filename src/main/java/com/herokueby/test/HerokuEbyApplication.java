package com.herokueby.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HerokuEbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuEbyApplication.class, args);
	}

}
@RestController
class restclass
{
	@GetMapping("/")
	public String helloworld()
	{
		return "Hello World";
	}
}