package com.herokuapp.QuizforProgrammingLanguages.javascript;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.QuizforProgrammingLanguages.Answer;
import com.herokuapp.QuizforProgrammingLanguages.Score;

@RestController
public class JavaScriptController {

	@Autowired
	private JavaScriptService javascriptService;
	
	@GetMapping("/js")
	public List<JavaScript>  getAllJS() {
		return javascriptService.getAllJS();
	}
	
	@PostMapping("/js/submit")
	public Score score(@RequestBody Answer ans) {
		String answer = ans.getAnswer();

		int score = javascriptService.score(answer);
		Score sc = new Score(score);
		return sc;
	}
	
}
