package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.EmployeeService;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeService;
	
	//display list of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",employeService.getAllEmployees());
		return "index";
	}

}
