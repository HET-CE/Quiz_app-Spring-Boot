package com.herokuapp.QuizforProgrammingLanguages.python;

import java.util.*;
import com.herokuapp.QuizforProgrammingLanguages.Score;
import com.herokuapp.QuizforProgrammingLanguages.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PythonController {

	@Autowired
	private PythonService pythonService;
	
	@GetMapping("/python")
	public List<Python>  getAllPythons() {
		return pythonService.getAllPythons();
	}
	
	@PostMapping("/python/submit")
	public Score score(@RequestBody Answer ans) {
		String answer = ans.getAnswer();

		int score = pythonService.score(answer);
		Score sc = new Score(score);
		return sc;
	}
	
}
