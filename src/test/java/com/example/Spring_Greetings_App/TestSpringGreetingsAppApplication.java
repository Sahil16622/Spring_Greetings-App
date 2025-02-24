package com.example.Spring_Greetings_App;

import org.springframework.boot.SpringApplication;

public class TestSpringGreetingsAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringGreetingsAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
