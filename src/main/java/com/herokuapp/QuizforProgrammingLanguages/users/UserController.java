package com.herokuapp.QuizforProgrammingLanguages.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	
	@PostMapping("/login")
	public void login(@RequestBody Users user) {
		userService.login(user);
	}
	
//	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "video not found")
//	public class NotFoundException extends RuntimeException {
//	}
}
