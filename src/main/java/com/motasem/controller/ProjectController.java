package com.motasem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("name")
public class ProjectController {
	
	@GetMapping
	public String print() {
		return "Welcome to Jenkins";
	}
	
	@GetMapping
	@RequestMapping("{name}")
	public String print(@PathVariable String name) {
		return "Welcome " + name;
	}

}
