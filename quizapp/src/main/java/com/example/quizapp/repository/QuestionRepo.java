package com.example.quizapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.quizapp.entity.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);

}
