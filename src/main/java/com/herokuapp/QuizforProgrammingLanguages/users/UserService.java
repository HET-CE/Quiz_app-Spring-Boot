package com.herokuapp.QuizforProgrammingLanguages.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void login(Users user) {
		userRepository.save(user);
	}
	
	
}
