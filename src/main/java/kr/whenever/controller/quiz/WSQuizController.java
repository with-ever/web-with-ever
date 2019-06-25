package kr.whenever.controller.quiz;

import java.util.ArrayList;
import java.util.List;

import kr.whenever.domain.Quiz;
import kr.whenever.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ws/quiz")
public class WSQuizController {

	@Autowired
	private QuizService quizService;
	
	//@Autowired
	//private QuizService quizService;
	
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Quiz> quizList(){
//		List<Quiz> list = quizMapper.selectQuizList();
//		List<Quiz> quizList = this.quizService.findQuizList();
		List<Quiz> list = getQuizs();
		return list;
	}
	
	private List<Quiz> getQuizs(){
		List<Quiz> list = new ArrayList<Quiz>();
		for(int index = 0; index<5; index++){
			Quiz quiz = new Quiz(Long.valueOf(index), "언어" + index, String.valueOf(index), "내용" + index);
			list.add(quiz);
		}
		return list;
	}
}
