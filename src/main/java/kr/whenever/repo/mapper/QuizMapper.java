package kr.whenever.repo.mapper;

import java.util.List;

import kr.whenever.domain.Quiz;

import org.apache.ibatis.annotations.Param;

public interface QuizMapper {
	void insertQuiz(Quiz quiz);

	void updateQuiz(Quiz quiz);
	
	void deleteQuiz(@Param("id") Long id);
	
	Quiz selectQuiz(@Param("id") Long id);

	List<Quiz> selectQuizs();
}
