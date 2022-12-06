package com.springmvc.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.mvc.dto.Employee;

@Controller
public class ControllerHello {
	@RequestMapping("/hell")
	public ModelAndView hello() {
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("hell");

		
		return  modelAndView;
	}
	
	
}
