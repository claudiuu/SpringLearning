/**
 * 
 */
package com.github.claudiuu.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.github.claudiuu.springdemo.beans.Organization;

/**
 * @author claudiu
 *
 */
public interface IOrganizationDAO {

	/**
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * @param org
	 * @return
	 */
	public boolean create(Organization org);
	
	/**
	 * @param org
	 * @return
	 */
	public boolean update(Organization org);
	
	/**
	 * @param org
	 * @return
	 */
	public boolean delete(Organization org);
	
	/**
	 * @param id
	 * @return
	 */
	public Organization getOrganization(Integer id);
	
	/**
	 * @return
	 */
	public List<Organization> getAllOrganizations();
	
	/**
	 * 
	 */
	public void cleanup();
}
