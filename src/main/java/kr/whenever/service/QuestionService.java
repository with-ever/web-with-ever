package kr.whenever.service;

import java.util.List;
import kr.whenever.domain.Question;

public interface QuestionService {
	
	void registerQuestion(Question question);
	
	void modifyQuestion(Question question);
	
	void removeQuestion(Long id);
	
	Question findQuestion(Long id);
	
	List<Question> findQuestions();
}
