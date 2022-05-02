package com.herokuapp.QuizforProgrammingLanguages.java;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface JavaRepository extends CrudRepository<Java, String>{

	public List<Java> findByUsername(String username);
}
