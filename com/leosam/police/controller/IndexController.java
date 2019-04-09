package com.leosam.police.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author congli216488
 */
@Controller
@RequestMapping(value = {"/"})
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = {"/", "/index", "/index.html"})
	public String index(HttpServletRequest request) {
		return "index";
	}

	@RequestMapping(value = {"/welcome.html"})
	public String welcome(HttpServletRequest request) {
		return "welcome";
	}

}
