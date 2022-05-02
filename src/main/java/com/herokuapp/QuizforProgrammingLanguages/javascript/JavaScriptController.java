package com.herokuapp.QuizforProgrammingLanguages.javascript;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaScriptController {

	@Autowired
	private JavaScriptService javascriptService;
	
	@GetMapping("/js/{username}")
	public List<JavaScipt>  getAllPythonsByUserName(@PathVariable String username) {
		return javascriptService.getAllPythonsByUserName(username);
	}
	
}
