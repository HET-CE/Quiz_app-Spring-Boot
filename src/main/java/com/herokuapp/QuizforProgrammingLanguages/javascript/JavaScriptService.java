package com.herokuapp.QuizforProgrammingLanguages.javascript;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaScriptService {
	
	@Autowired
	private JavaScriptRepository javascriptRepository;
	
	public List<JavaScript> getAllJS(){
		List<JavaScript> js = new ArrayList<>();
		javascriptRepository.findAll().forEach(js::add);
 		return js;
	}
	
	public int score(String answer) {
		List<JavaScript> js = new ArrayList<>();
		javascriptRepository.findAll().forEach(js::add);
		String originalAnswer = "";
 		for(int i=0;i<js.size();i++) {
 			originalAnswer += js.get(i).getAnswer();
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
