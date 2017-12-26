package com.github.claudiuu.springdemo;

/**
 * @author claudiu
 *
 */
public class Organization {

	private String name;
	private String address;
	private int yearOfInc;
	private int employees;
	
	/**
	 * @param name
	 * @param yearCreated
	 */
	public Organization(String name, int yearCreated) {
		super();
		this.name = name;
		this.address = address;
		this.yearOfInc = yearCreated;
		this.employees = employees;
	}

	/**
	 * 
	 */
	public void corporateSlogan() {
		System.out.println("We want a lot of money");
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
}
