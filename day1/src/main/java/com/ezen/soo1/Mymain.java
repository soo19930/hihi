package com.ezen.soo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//경로가지고와서 출력하는 파일
public class Mymain {

	public static void main(String[] args) {
		
//		String path="classpath:MyApp.xml";
//		AbstractApplicationContext aac=
//				new GenericXmlApplicationContext(path); //이걸 구동해서 acc객체를 실행해라
//		My mm= aac.getBean("my",My.class);
//		mm.out();
		
		AnnotationConfigApplicationContext acac
		=new AnnotationConfigApplicationContext(Myconfig.class);
		 My mm=	acac.getBean("bibi",My.class);
		 mm.out();
		
	}

}
