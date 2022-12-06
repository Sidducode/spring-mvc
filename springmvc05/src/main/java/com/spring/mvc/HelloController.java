package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dto.User;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("userReg");
		return  modelAndView;
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView helloReg(@ModelAttribute("user")User user) {
		System.out.println(user);
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regResult");
		return  modelAndView;
	}
	
	
	@RequestMapping("/showdata")
	public ModelAndView helloRegest(@RequestParam("id") int id,@RequestParam("name") String name,
			@RequestParam("sal") double salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		return  new ModelAndView("userReg");
	}

}
