/**
 *
 */
package com.github.claudiuu.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.github.claudiuu.springdemo.beans.Organization;

/**
 * @author claudiu
 *
 */
public class OrganizationDAO implements IOrganizationDAO {

	private NamedParameterJdbcTemplate jdbcTempl;

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#setDataSource(javax.sql.DataSource)
	 */
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTempl = new NamedParameterJdbcTemplate(dataSource);
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#create(com.github.claudiuu.springdemo.beans.Organization)
	 */
	@Override
	public boolean create(Organization org) {
		// this will map each property of the bean to its value
		// making it easy for us to pass the parameters to the query
		SqlParameterSource params = new BeanPropertySqlParameterSource(org);
		String sql = "insert into organization(company_name, employee_count, year_of_inc) values (:companyName, :employeeCount, :yearOfInc)";

		return jdbcTempl.update(sql, params) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#update(com.github.claudiuu.springdemo.beans.Organization)
	 */
	@Override
	public boolean update(Organization org) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(org);
		String sql = "update organization set "
				+ "company_name = :companyName, "
				+ "employee_count = :employeeCount, "
				+ "year_of_inc = :yearOfInc "
				+ "where id = :id";

		return jdbcTempl.update(sql, params) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#delete(com.github.claudiuu.springdemo.beans.Organization)
	 */
	@Override
	public boolean delete(Organization org) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(org);
		String sql = "delete from organization where id = :id";
		return jdbcTempl.update(sql, params) == 1;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#getOrganization(java.lang.Integer)
	 */
	@Override
	public Organization getOrganization(Integer id) {
		SqlParameterSource params = new MapSqlParameterSource("ID", id);
		String sql = "select id, company_name, employee_count, year_of_inc "
				+ "from organization "
				+ "where id = :ID";
		Organization org = jdbcTempl.queryForObject(sql, params, new OrganizationRowMapper());
		return org;
	}

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.dao.IOrganizationDAO#getAllOrganizations()
	 */
	@Override
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
		// NamedParameterJdbcTemplate does not implement the execute method
		// but we can access the underlying JdbcTemplate to execute DDL queries
		jdbcTempl.getJdbcOperations().execute(sqlQuery);
	}

}
