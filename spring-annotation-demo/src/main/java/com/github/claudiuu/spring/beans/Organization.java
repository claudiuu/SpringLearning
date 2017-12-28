/**
 * 
 */
package com.github.claudiuu.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author claudiu
 *
 */
@Component("myorg")
public class Organization {

	@Value("${org.name}")
	private String name;
	
	@Value("${org.address}")
	private String address;
	
	private int yearOfInc;
	
	@Value("${org.employeeCount:3000}")
	private int employeeCount;
	
	
	/**
	 * @param yearOfInc the yearOfInc to set
	 */
	@Autowired
	public void setYearOfInc(@Value("${org.year}")int yearOfInc) {
		this.yearOfInc = yearOfInc;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", yearOfInc=" + yearOfInc + ", employeeCount="
				+ employeeCount + "]";
	}
}
