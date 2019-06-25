package kr.whenever.service;

import java.util.List;
import kr.whenever.domain.Answer;


public interface AnswerService {
	
	void registerAnswer(Answer answer);
	
	void modifyAnswer(Answer answer);
	
	void removeAnswer(Long id);
	
	Answer findAnswer(Long id);
	
	List<Answer> findAnswers();
	
}
