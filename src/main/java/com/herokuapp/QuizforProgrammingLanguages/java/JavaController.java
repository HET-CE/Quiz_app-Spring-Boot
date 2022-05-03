package com.herokuapp.QuizforProgrammingLanguages.java;
import com.herokuapp.QuizforProgrammingLanguages.Answer;
import com.herokuapp.QuizforProgrammingLanguages.Score;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

	@Autowired
	private JavaService javaService;
	
	@GetMapping("/java")
	public List<Java>  getAllJavas() {
		return javaService.getAllJavas();
	}
	
	@PostMapping("/java/submit")
	public Score score(@RequestBody Answer ans) {
		String answer = ans.getAnswer();

		int score = javaService.score(answer);
		Score sc = new Score(score);
		return sc;
	}
}
