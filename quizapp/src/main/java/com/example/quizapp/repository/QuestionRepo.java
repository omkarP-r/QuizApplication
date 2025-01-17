package com.example.quizapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quizapp.entity.Question;


@Repository
public interface QuestionRepo extends CrudRepository<Question, Integer> {

}
