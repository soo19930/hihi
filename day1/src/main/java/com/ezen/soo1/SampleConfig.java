package com.ezen.soo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//일반 클래스 데이터가 들어가면 만들수있는 틀이있어야함
//필드+메소드가 있어야함 
//Sample클래스는 틀만 있음
@Configuration 
public class SampleConfig {
	@Bean 
	//객체를 만들어내는 매소드
	public Sample koko() { //Sample 반환되는 객체명 ss의 반환객체명은 Sample
		//koko를 부르면 객체를 만들어야함
		Sample ss = new Sample();
		ss.setFirst(44);
		ss.setSecond(56);
		return ss;
	}

}
