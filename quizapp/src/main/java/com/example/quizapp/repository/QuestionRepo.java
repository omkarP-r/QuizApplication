package com.example.quizapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quizapp.entity.Question;


@Repository
public interface QuestionRepo extends CrudRepository<Question, Integer> {

	List<Question> findByCategory(String category);

}
