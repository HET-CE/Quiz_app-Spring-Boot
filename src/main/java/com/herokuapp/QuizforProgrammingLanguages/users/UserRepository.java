package com.herokuapp.QuizforProgrammingLanguages.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

}
