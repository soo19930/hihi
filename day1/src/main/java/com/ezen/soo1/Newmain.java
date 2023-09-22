package com.ezen.soo1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Newmain {

	public static void main(String[] args) {
		
		
		String path="classpath:NewApp.xml";
		AbstractApplicationContext aac=
				new GenericXmlApplicationContext(path);
		New nn=aac.getBean("new",New.class);
		nn.out();

	}

}
