package com.springmvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.springmvc.mvc.userdto.User;

@Controller
public class UserController {
	
	@RequestMapping("/userreg")
	public ModelAndView hello() {
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("userReg");
		return  modelAndView;
	}
	
	@RequestMapping(value="regiuser",method=RequestMethod.POST)
	public ModelAndView hello1(@ModelAttribute("user")User user) {
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("userReg");
		return  modelAndView;
	}

}
