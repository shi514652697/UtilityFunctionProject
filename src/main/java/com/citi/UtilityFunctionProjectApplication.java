package com.citi;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtilityFunctionProjectApplication {

	public static void main(String[] args) {
		//default time zone
		TimeZone.setDefault(TimeZone.getTimeZone("CST6CDT"));
		SpringApplication.run(UtilityFunctionProjectApplication.class, args);
	}

}
