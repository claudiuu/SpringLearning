/**
 * 
 */
package com.github.claudiuu.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.github.claudiuu.springdemo.beans.Organization;

/**
 * @author claudiu
 *
 */
public class OrganizationDAO implements IOrganizationDAO {

	private JdbcTemplate jdbcTempl;
	
	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#setDataSource(javax.sql.DataSource)
	 */
	public void setDataSource(DataSource dataSource) {
		jdbcTempl = new JdbcTemplate(dataSource);
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#create(com.github.claudiuu.springdemo.beans.Organization)
	 */
	public boolean create(Organization org) {
		String sql = "insert into organization(company_name, employee_count, year_of_inc) values (?, ?, ?)";
		return jdbcTempl.update(sql, new Object[] {org.getCompanyName(), org.getEmployeeCount(), org.getYearOfInc()}) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#update(com.github.claudiuu.springdemo.beans.Organization)
	 */
	public boolean update(Organization org) {
		String sql = "update organization set "
				+ "company_name = ?, "
				+ "employee_count = ?, "
				+ "year_of_inc = ? "
				+ "where id = ?";
		Object[] args = new Object[] {org.getCompanyName(), org.getEmployeeCount(), org.getYearOfInc(), org.getId()};
		
		return jdbcTempl.update(sql, args) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#delete(com.github.claudiuu.springdemo.beans.Organization)
	 */
	public boolean delete(Organization org) {
		String sql = "delete from organization where id = ?";
		return jdbcTempl.update(sql, new Object[] {org.getId()}) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#getOrganization(java.lang.Integer)
	 */
	public Organization getOrganization(Integer id) {
		String sql = "select id, company_name, employee_count, year_of_inc "
				+ "from organization "
				+ "where id = ?";
		Organization org = jdbcTempl.queryForObject(sql, new Object[] {id}, new OrganizationRowMapper());
		return org;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#getAllOrganizations()
	 */
	public List<Organization> getAllOrganizations() {
		String sql = "select * from organization";
		List<Organization> allOrgs = jdbcTempl.query(sql, new OrganizationRowMapper());
		return allOrgs;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#cleanup()
	 */
	@Override
	public void cleanup() {
		String sqlQuery = "TRUNCATE TABLE organization ";
		jdbcTempl.execute(sqlQuery);
	}

}
