package com.ezen.soo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Myconfig {
	@Bean
	public My bibi() {
		My mm = new My();
		mm.setName("±è±æµ¿");
		mm.setAge(30);
		mm.setPhone("010-1234-1234");	
		return mm;
	}
}
