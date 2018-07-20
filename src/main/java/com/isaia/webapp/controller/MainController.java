package com.isaia.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
	/**
	 * load login page (index.html)
	 * @return
	 */
	@RequestMapping(value="/", method= RequestMethod.GET)	
	public String index(){	
 
	    return "index";
	}
 
}