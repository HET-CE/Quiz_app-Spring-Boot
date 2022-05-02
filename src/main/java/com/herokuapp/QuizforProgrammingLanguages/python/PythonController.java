package com.herokuapp.QuizforProgrammingLanguages.python;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PythonController {

	@Autowired
	private PythonService pythonService;
	
	@GetMapping("/python/{username}")
	public List<Python>  getAllPythonsByUserName(@PathVariable String username) {
		return pythonService.getAllPythonsByUserName(username);
	}
	
}
