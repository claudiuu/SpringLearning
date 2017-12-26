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
public class SetterDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		org.corporateSlogan();
		System.out.println(org);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
