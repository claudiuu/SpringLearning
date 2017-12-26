/**
 * 
 */
package com.github.claudiuu.demo.service;

import java.util.Arrays;
import java.util.List;

/**
 * @author claudiu
 *
 */
public class HelloWorldService {

	public List<String> getMessage() {
		return Arrays.asList("Hello, ", "World!", "Welcome to Spring Learning!");
	}
}
