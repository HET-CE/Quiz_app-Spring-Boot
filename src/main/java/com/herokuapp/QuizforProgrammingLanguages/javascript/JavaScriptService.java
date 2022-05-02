package com.herokuapp.QuizforProgrammingLanguages.javascript;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaScriptService {
	
	@Autowired
	private JavaScriptRepository javascriptRepository;
	
	public List<JavaScipt> getAllPythonsByUserName(String username){
		List<JavaScipt> pythons = new ArrayList<>();
		javascriptRepository.findByUsername(username).forEach(pythons::add);
 		return pythons;
	}
}
