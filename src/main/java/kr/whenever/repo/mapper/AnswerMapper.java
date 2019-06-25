package kr.whenever.repo.mapper;

import java.util.List;

import kr.whenever.domain.Answer;

import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
	
void insertAnswer(Answer answer);
	
	void updateAnswer(Answer answer);
	
	void deleteAnswer(@Param("id") Long id);
	
	Answer selectAnswer(@Param("id") Long id);
	
	List<Answer> selectAnswers();
}
