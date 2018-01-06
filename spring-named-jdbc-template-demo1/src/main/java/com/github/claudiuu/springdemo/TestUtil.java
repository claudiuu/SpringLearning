/**
 *
 */
package com.github.claudiuu.springdemo;

import org.springframework.stereotype.Service;

import com.github.claudiuu.springdemo.beans.Organization;
import com.github.claudiuu.springdemo.dao.IOrganizationDAO;

/**
 * @author claudiu
 *
 */
@Service
public class TestUtil {

	/**
	 * @param dao
	 */
	public void createOrganizationSeedData(IOrganizationDAO dao) {
		dao.create(new Organization("Amazon", 20000, 1994));
		dao.create(new Organization("Google", 30000, 1998));
		dao.create(new Organization("Microsoft", 15000, 1980));
	}

	/**
	 * @param dao
	 */
	public void printAllOrganizations(IOrganizationDAO dao) {
		dao.getAllOrganizations().forEach(o -> System.out.println(o));
		System.out.println();
	}
}
