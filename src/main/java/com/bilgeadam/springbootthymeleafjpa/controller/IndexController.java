package com.bilgeadam.springbootthymeleafjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = { "", "/", "/wellcome" })
public class IndexController
{
	@GetMapping()
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
}