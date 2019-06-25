package kr.whenever.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.whenever.domain.Question;
import kr.whenever.repo.QuestionRepository;
import kr.whenever.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public void registerQuestion(Question question) {
		// 
		this.questionRepository.registerQuestion(question);
	}

	@Override
	public void modifyQuestion(Question question) {
		//
		this.questionRepository.modifyQuestion(question);
	}

	@Override
	public void removeQuestion(Long id) {
		//
		this.questionRepository.removeQuestion(id);
	}

	@Override
	public Question findQuestion(Long id) {
		return this.questionRepository.findQuestion(id);
	}

	@Override
	public List<Question> findQuestions() {
		return this.questionRepository.findQuestions();
	}
	
}
