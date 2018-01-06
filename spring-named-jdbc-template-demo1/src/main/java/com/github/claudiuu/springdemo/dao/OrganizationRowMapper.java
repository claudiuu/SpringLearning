/**
 * 
 */
package com.github.claudiuu.springdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.claudiuu.springdemo.beans.Organization;

/**
 * @author claudiu
 *
 */
public class OrganizationRowMapper implements RowMapper<Organization> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organization org = new Organization();
		
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("company_name"));
		org.setEmployeeCount(rs.getInt("employee_count"));
		org.setYearOfInc(rs.getInt("year_of_inc"));
		
		return org;
	}

}
