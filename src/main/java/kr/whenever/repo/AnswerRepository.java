package kr.whenever.repo;

import java.util.List;

import kr.whenever.domain.Answer;
import kr.whenever.repo.mapper.AnswerMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerRepository {

	@Autowired
	private AnswerMapper answerMapper;
	
	public void registerAnswer(Answer answer) {
		this.answerMapper.insertAnswer(answer);
	}
	
	public void modifyAnswer(Answer answer) {
		this.answerMapper.updateAnswer(answer);
	}
	
	public void removeAnswer(Long id) {
		this.answerMapper.deleteAnswer(id);
	}
	
	public Answer findAnswer(Long id) {
		return this.answerMapper.selectAnswer(id);
	}
	
	public List<Answer> findAnswers() {
		return this.answerMapper.selectAnswers();
	}	
}
