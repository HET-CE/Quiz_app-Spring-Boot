package com.herokuapp.QuizforProgrammingLanguages.java;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
	
	@Autowired
	private JavaRepository javaRepository;
	
	public List<Java> getAllJavas(){
		List<Java> javas = new ArrayList<>();
 		javaRepository.findAll().forEach(javas::add);
 		return javas;
	}
	
	public int score(String answer) {
		List<Java> javas = new ArrayList<>();
 		javaRepository.findAll().forEach(javas::add);
 		String originalAnswer = "";
 		for(int i=0;i<javas.size();i++) {
 			originalAnswer += javas.get(i).getAnswer();
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
