package com.herokuapp.QuizforProgrammingLanguages.python;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PythonService {
	
	@Autowired
	private PythonRepository pythonRepository;
	
	public List<Python> getAllPythonsByUserName(String username){
		List<Python> pythons = new ArrayList<>();
		pythonRepository.findByUsername(username).forEach(pythons::add);
 		return pythons;
	}
}
