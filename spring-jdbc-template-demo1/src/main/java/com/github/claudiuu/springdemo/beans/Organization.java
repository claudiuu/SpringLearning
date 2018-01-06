/**
 * 
 */
package com.github.claudiuu.springdemo.beans;

/**
 * @author claudiu
 *
 */
public class Organization {

	private int id;
	private String companyName;
	private int employeeCount;
	private int yearOfInc;
	
	/**
	 * Empty constructor
	 */
	public Organization() {
		
	}
	
	/**
	 * @param companyName
	 * @param employeeCount
	 * @param yearOfInc
	 */
	public Organization(String companyName, int employeeCount, int yearOfInc) {
		this.companyName = companyName;
		this.employeeCount = employeeCount;
		this.yearOfInc = yearOfInc;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the employeeCount
	 */
	public int getEmployeeCount() {
		return employeeCount;
	}
	/**
	 * @param employeeCount the employeeCount to set
	 */
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	/**
	 * @return the yearOfInc
	 */
	public int getYearOfInc() {
		return yearOfInc;
	}
	/**
	 * @param yearOfInc the yearOfInc to set
	 */
	public void setYearOfInc(int yearOfInc) {
		this.yearOfInc = yearOfInc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [id=" + id + ", companyName=" + companyName + ", employeeCount=" + employeeCount
				+ ", yearOfInc=" + yearOfInc + "]";
	}
}
