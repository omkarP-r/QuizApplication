package com.example.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizapp.entity.Question;
import com.example.quizapp.repository.QuestionRepo;

@Service
public class QuestionService {
	
	@Autowired
  QuestionRepo qr;
	
	
public List<Question> getAllQuestions() {
		return (List<Question>) qr.findAll();
	}
}
