package com.example.Spring_Greetings_App;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringGreetingsAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
