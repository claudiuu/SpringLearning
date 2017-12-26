/**
 * 
 */
package com.github.claudiuu.springdemo.beans;

/**
 * @author claudiu
 *
 */
public class Department {

	private Organization organization;
	private String deptName;
	
	/**
	 * @param organization
	 */
	public Department(Organization organization) {
		this.organization = organization;
	}

	/**
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [organization=" + organization.getName() + ", deptName=" + deptName + "]";
	}
	
}
