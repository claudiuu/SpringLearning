package com.github.claudiuu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author claudiu
 *
 */
@Configuration
@ComponentScan(basePackages = "com.github.claudiuu.spring")
@PropertySource(value = {"classpath:properties/organization.properties"})
public class PropertyConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
