package kr.whenever.controller.question;

import java.util.List;

import kr.whenever.domain.Question;
import kr.whenever.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView list() {
		
		List<Question> questions = this.questionService.findQuestions();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/question/questionList");
		mav.addObject("questions", questions);
		return mav;		
	}
	
	@RequestMapping(value="/new", method = RequestMethod.GET)
	public ModelAndView registerForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("question/questionRegist");
		return mav;		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView register(Question question) {
		this.questionService.registerQuestion(question);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/question/list");
		return mav;
	}
	
	@RequestMapping(value = "/{id}/modify", method = RequestMethod.GET)
	public ModelAndView modifyForm(
			@PathVariable(value = "id") Long id
			){
		Question question = this.questionService.findQuestion(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/question/questionModify");
		mav.addObject("question", question);
		return mav;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ModelAndView modify(
			@PathVariable(value = "id") Long id,
			Question question
			){
		question.setId(id);
		this.questionService.modifyQuestion(question);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/question/list");
		return mav;
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public ModelAndView delete(
			@PathVariable(value = "id") Long id
			){
		this.questionService.removeQuestion(id);
		return new ModelAndView("redirect:/question/list");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView find(
			@PathVariable(value = "id") Long id
			){
		Question question = this.questionService.findQuestion(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/question/questionView");
		mav.addObject("question", question);
		return mav;
	}
}
