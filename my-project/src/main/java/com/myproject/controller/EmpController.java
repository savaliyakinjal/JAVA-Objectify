package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.model.Employee;
import com.myproject.service.EmpService;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
//	@PostMapping(value = "/addEmp")
//	public String addEmployee() {
//		Employee employee=new Employee();
//		employee.setName("kinjal");
//		employee.setEmail("kinjal@gmail.com");
//		
//		empService.addEmp(employee);
//		return "index";
//		
//	}
	
	@RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	public String addEmp(@ModelAttribute("emp") Employee e) {
		empService.addEmp(e);
		return "index";
	}
}
