/**
 * 
 */
package com.github.claudiuu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.claudiuu.springdemo.beans.Organization;
import com.github.claudiuu.springdemo.dao.IOrganizationDAO;

/**
 * @author claudiu
 *
 */
public class JdbcTemplateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		IOrganizationDAO dao = (IOrganizationDAO) ctx.getBean("dao");
		
		// create initial Organization list
		TestUtil.createOrganizationSeedData(dao);
		
		TestUtil.printAllOrganizations(dao);
		
		Organization org = dao.getOrganization(1);
		System.out.println("Org with id 1 is " + org);
		
		org.setEmployeeCount(10000);
		org.setYearOfInc(2017);
		dao.update(org);
		
		dao.delete(dao.getOrganization(2));
		
		TestUtil.printAllOrganizations(dao);
		
		// clean up the test data
		dao.cleanup();
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
