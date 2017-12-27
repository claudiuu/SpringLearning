/**
 * 
 */
package com.github.claudiuu.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.claudiuu.springdemo.service.IService;

/**
 * @author claudiu
 *
 */
@Controller
public class WelcomeController {

	@Autowired
	private IService service;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		model.addAttribute("mymsg", service.getMessage());
		
		// this will be used by the view resolver to determine the view file
		// from /WEB-INF/views/welcome.jps
		return "welcome";
	}
}
