package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;

@RestController
public class RegController {

	@GetMapping("/allEmp")
	public List<Employee> getAllEmp() {

		List<Employee> empList = Arrays.asList(new Employee(1001, "Srini", "dev"), new Employee(1002, "Srini", "dev"),
				new Employee(1003, "Srini", "dev")

		);
		return empList;

	}

}
