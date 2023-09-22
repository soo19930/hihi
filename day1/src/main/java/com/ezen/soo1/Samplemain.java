package com.ezen.soo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Samplemain {

	public static void main(String[] args) {

//		Sample sam = new Sample();
//		sam.setFirst(33);
//		sam.setSecond(56);
//		sam.out();
//xml사용방법	
		//xml파일이 존재하는 경호 classpath
//		String path="classpath:SamApp.xml";
//		AbstractApplicationContext aac=
//				new GenericXmlApplicationContext(path); //경로에가서 bean을 가져와라
//		Sample ss=aac.getBean("sam",Sample.class);
//		ss.out();
			
//자바클래스이용방법		
AnnotationConfigApplicationContext acac
=new AnnotationConfigApplicationContext(SampleConfig.class);
	Sample ss= acac.getBean("koko",Sample.class);
	ss.out();
	}

}
