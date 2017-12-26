package com.github.claudiuu.springdemo.beans;

/**
 * @author claudiu
 *
 */
public class Organization {

	private String name;
	private String address;
	private String slogan;
	private int yearOfInc;
	private int employees;
	private IBusinessService service;
	
	/**
	 * @param name
	 * @param yearCreated
	 */
	public Organization(String name, int yearCreated) {
		this.name = name;
		this.yearOfInc = yearCreated;
	}

	/**
	 * 
	 */
	public String corporateSlogan() {
		return slogan;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", yearOfInc=" + yearOfInc + ", employees="
				+ employees + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the yearCreated
	 */
	public int getYearOfInc() {
		return yearOfInc;
	}


	/**
	 * @param yearCreated the yearCreated to set
	 */
	public void setYearOfInc(int yearCreated) {
		this.yearOfInc = yearCreated;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the employees
	 */
	public int getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(int employees) {
		this.employees = employees;
	}

	/**
	 * @return the service
	 */
	public IBusinessService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(IBusinessService service) {
		this.service = service;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	/**
	 * @return
	 */
	public String describeService() {
		return service.offerService(name);
	}
}
