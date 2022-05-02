package com.herokuapp.QuizforProgrammingLanguages.java;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

	@Autowired
	private JavaService javaService;
	
	@GetMapping("/java/{username}")
	public List<Java>  getAllJavasByUsername(@PathVariable String username) {
		return javaService.getAllJavasByUsername(username);
	}
	
}
