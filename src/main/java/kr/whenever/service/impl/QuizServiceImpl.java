package kr.whenever.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.whenever.domain.Quiz;
import kr.whenever.repo.QuizRepository;
import kr.whenever.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository quizRepository;
	
	@Override
	public void registerQuiz(Quiz quiz) {
		// 
		this.quizRepository.registerQuiz(quiz);
	}

	@Override
	public void modifyQuiz(Quiz quiz) {
		//
		this.quizRepository.modifyQuiz(quiz);
	}

	@Override
	public void removeQuiz(Long id) {
		//
		this.quizRepository.removeQuiz(id);
	}

	@Override
	public Quiz findQuiz(Long id) {
		return this.quizRepository.findQuiz(id);
	}

	@Override
	public List<Quiz> findQuizList() {
		return this.quizRepository.findQuizs();
	}
	
}
