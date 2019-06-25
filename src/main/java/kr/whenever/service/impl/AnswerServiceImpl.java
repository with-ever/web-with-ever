package kr.whenever.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.whenever.domain.Answer;
import kr.whenever.repo.AnswerRepository;
import kr.whenever.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Override
	public void registerAnswer(Answer answer) {
		this.answerRepository.registerAnswer(answer);
	}

	@Override
	public void modifyAnswer(Answer answer) {
		this.answerRepository.modifyAnswer(answer);
	}

	@Override
	public void removeAnswer(Long id) {
		this.answerRepository.removeAnswer(id);
	}

	@Override
	public Answer findAnswer(Long id) {
		return this.answerRepository.findAnswer(id);
	}

	@Override
	public List<Answer> findAnswers() {
		return this.answerRepository.findAnswers();
	}

}
