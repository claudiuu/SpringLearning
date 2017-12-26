package com.github.claudiuu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author claudiu
 *
 */
public class IOCDemo1 {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		org.corporateSlogan();
		
		((FileSystemXmlApplicationContext) ctx).close();
	}
}
