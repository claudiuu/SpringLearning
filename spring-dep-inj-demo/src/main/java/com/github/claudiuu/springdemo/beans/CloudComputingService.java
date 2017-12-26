/**
 * 
 */
package com.github.claudiuu.springdemo.beans;

/**
 * @author claudiu
 *
 */
public class CloudComputingService implements IBusinessService {

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.beans.IBusinessService#offerService(java.lang.String)
	 */
	public String offerService(String companyName) {
		return companyName + " offers premium cloud computing services";
	}

}
