package com.github.claudiuu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.claudiuu.spring.beans.Organization;

/**
 * @author claudiu
 *
 */
public class AnnotationConfigDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
