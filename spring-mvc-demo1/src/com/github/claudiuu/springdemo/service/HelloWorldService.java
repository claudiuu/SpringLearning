/**
 * 
 */
package com.github.claudiuu.springdemo.service;

import java.util.Arrays;
import java.util.List;

/**
 * @author claudiu
 *
 */
public class HelloWorldService implements IService {

	public List<String> getMessage() {
		return Arrays.asList("Hello, ", "World!", "Welcome to Spring Learning!");
	}
}
