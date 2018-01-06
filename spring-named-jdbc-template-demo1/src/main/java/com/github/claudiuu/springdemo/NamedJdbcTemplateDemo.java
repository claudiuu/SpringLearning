/**
 *
 */
package com.github.claudiuu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.github.claudiuu.springdemo.beans.Organization;
import com.github.claudiuu.springdemo.dao.IOrganizationDAO;

/**
 * @author claudiu
 *
 */
@Component
public class NamedJdbcTemplateDemo {

	@Autowired
	private IOrganizationDAO dao;

	@Autowired
	private TestUtil util;

	public void actionMethod() {
		// create initial Organization list
		util.createOrganizationSeedData(dao);

		util.printAllOrganizations(dao);

		Organization org = dao.getOrganization(1);
		System.out.println("Org with id 1 is " + org);

		org.setEmployeeCount(10000);
		org.setYearOfInc(2017);
		dao.update(org);

		dao.delete(dao.getOrganization(2));

		util.printAllOrganizations(dao);

		// clean up the test data
		dao.cleanup();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// because the class is annotated with @Component, Spring knows to manage this bean
		NamedJdbcTemplateDemo mainApp = ctx.getBean(NamedJdbcTemplateDemo.class);
		mainApp.actionMethod();

		((ClassPathXmlApplicationContext) ctx).close();

	}

}
