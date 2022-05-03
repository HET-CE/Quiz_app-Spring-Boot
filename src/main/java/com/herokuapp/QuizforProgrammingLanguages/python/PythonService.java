package com.herokuapp.QuizforProgrammingLanguages.python;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PythonService {
	
	@Autowired
	private PythonRepository pythonRepository;
	
	public List<Python> getAllPythons(){
		List<Python> pythons = new ArrayList<>();
		pythonRepository.findAll().forEach(pythons::add);
 		return pythons;
	}
	
	public int score(String answer) {
		List<Python> pythons = new ArrayList<>();
		pythonRepository.findAll().forEach(pythons::add);
		
		String originalAnswer = "";
 		for(int i=0;i<pythons.size();i++) {
 			originalAnswer += pythons.get(i).getAnswer();
 		}
 		int ans = 0;
 		for(int i=0;i < originalAnswer.length() ;i++) {
 			char q = originalAnswer.charAt(i);
 			char w = answer.charAt(i);
 			if(q == w)
 				ans++;
 		}
 		return ans;
	}
}
