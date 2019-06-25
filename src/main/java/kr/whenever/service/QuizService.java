package kr.whenever.service;

import java.util.List;
import kr.whenever.domain.Quiz;

public interface QuizService {	
	
	void registerQuiz(Quiz quiz);
	
	void modifyQuiz(Quiz quiz);
	
	void removeQuiz(Long id);
	
	Quiz findQuiz(Long id);
	
	List<Quiz> findQuizList();

}
