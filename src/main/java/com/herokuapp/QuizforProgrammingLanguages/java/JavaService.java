package com.herokuapp.QuizforProgrammingLanguages.java;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
	
	@Autowired
	private JavaRepository javaRepository;
	
	public List<Java> getAllJavasByUsername(String username){
		List<Java> javas = new ArrayList<>();
 		javaRepository.findByUsername(username).forEach(javas::add);
 		return javas;
	}
}
