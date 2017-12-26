/**
 * 
 */
package com.github.claudiuu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author claudiu
 *
 */
public class IOCDemo2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		org.corporateSlogan();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
