package com.herokuapp.QuizforProgrammingLanguages.python;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*
;

@Repository
public interface PythonRepository extends CrudRepository<Python, String>{

	public List<Python> findByUsername(String username);
}
