package com.herokuapp.QuizforProgrammingLanguages.javascript;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*
;

@Repository
public interface JavaScriptRepository extends CrudRepository<JavaScipt, String>{

	public List<JavaScipt> findByUsername(String username);
}
