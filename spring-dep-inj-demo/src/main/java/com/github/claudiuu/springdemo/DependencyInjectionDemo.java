/**
 * 
 */
package com.github.claudiuu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.claudiuu.springdemo.beans.Department;
import com.github.claudiuu.springdemo.beans.Organization;

/**
 * @author claudiu
 *
 */
public class DependencyInjectionDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org.corporateSlogan());
		System.out.println(org);
		System.out.println(org.describeService());
		
		Department dep = (Department) ctx.getBean("mydept");
		System.out.println(dep);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
