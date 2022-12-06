package com.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.dto.Employee;

public class ListController {

	@Controller
	public class ControllerHello {
		@RequestMapping("/list")
		public ModelAndView hello() {
			
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.addObject("listofdata");
			
			Employee emp1 = new Employee();
			emp1.setId(0);
			emp1.setName("sid");
			emp1.setPlace("vemp");
			
			Employee emp2 = new Employee();
			emp2.setId(0);
			emp2.setName("sid");
			emp2.setPlace("vemp");
			
			Employee emp3 = new Employee();
			emp3.setId(0);
			emp3.setName("sid");
			emp3.setPlace("vemp");
			
			Employee emp4 = new Employee();
			emp4.setId(0);
			emp4.setName("sid");
			emp4.setPlace("vemp");
			
			ArrayList<Employee> emp=new ArrayList<Employee>();
			
			emp.add(emp1);
			emp.add(emp2);
			emp.add(emp3);
			emp.add(emp4);
			
			modelAndView.addObject("employees", emp);
			
			return  modelAndView;
		}
		
		
	}
}
