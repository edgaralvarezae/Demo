package com.berserking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.berserking.demo.utils.Constants;

import static com.berserking.demo.utils.Constants.MENSAJE_CLIMA_OK;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/getClima")
	public String getMessage(){
		return MENSAJE_CLIMA_OK;
	}

}
