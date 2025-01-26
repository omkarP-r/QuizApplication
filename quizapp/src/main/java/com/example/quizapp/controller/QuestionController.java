package com.example.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizapp.entity.Question;
import com.example.quizapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	QuestionService qservice;
	
	@GetMapping("allQuestions")
	public List<Question> getAllQuestions() {
		return qservice.getAllQuestions();
		
	}
	
	
	@GetMapping("category/{category}")
	public List<Question> getQuestionByCategory(@PathVariable String category){
		return qservice.getQuetionByCategory(category);
		
	}
	
	@PostMapping("add/question")
	public String addQuestion(Question question) {
		return qservice.addQuestion(question);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteQuestion(@PathVariable Integer id) {
		 qservice.deleteQuestion(id);
		 return "Success";
	}
	
	
	@DeleteMapping("delete/{category}")
	public String deleteQuestionByCategory(@PathVariable String category ) {
		 qservice.deleteQuestionByCategory(category);
		 return "Success";
	}
	

}
