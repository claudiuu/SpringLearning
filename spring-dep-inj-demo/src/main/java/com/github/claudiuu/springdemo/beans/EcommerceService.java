/**
 * 
 */
package com.github.claudiuu.springdemo.beans;

/**
 * @author claudiu
 *
 */
public class EcommerceService implements IBusinessService {

	/* (non-Javadoc)
	 * @see com.github.claudiuu.springdemo.beans.IBusinessService#offerService(java.lang.String)
	 */
	public String offerService(String companyName) {
		return companyName + " is one of the best e-commerce platforms";
	}

}
