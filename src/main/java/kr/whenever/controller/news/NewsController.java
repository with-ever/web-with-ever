package kr.whenever.controller.news;

import java.util.List;

import kr.whenever.domain.News;
import kr.whenever.service.NewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
	
	@Autowired
	private NewsService newsService;

	/**
	 * 뉴스 목록
	 * @return
	 */
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView findNewsList(){
		//
		List<News> news = this.newsService.findNewsList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/news/newsList");
		mav.addObject("news", news);
		return mav;
	}
	
	/**
	 * 뉴스 등록 화면
	 * @return
	 */
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView registerNewsForm(){
		//
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/news/newsRegist");
		return mav;
	}
	
	/**
	 * 뉴스 등록
	 * @param news
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registerNews(
			News news
			){
		//
		this.newsService.registerNews(news);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/news/list");
		return mav;
	}
	
	/**
	 * 뉴스 수정 화면
	 * @param news
	 * @return
	 */
	@RequestMapping(value = "/{id}/modify", method = RequestMethod.GET)
	public ModelAndView modifyNewsForm(
			@PathVariable(value = "id") Long id
			){
		//
		News news = this.newsService.findNews(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/news/newsModify");
		mav.addObject("news", news);
		return mav;
	}
	
	/**
	 * 뉴스 수정
	 * @param id
	 * @param news
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ModelAndView modifyNews(
			@PathVariable(value = "id") int id,
			News news
			){
		//
		this.newsService.modifyNews(news);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/news/list");
		return mav;
	}
	
	/**
	 * 뉴스 삭제
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}/remove", method = RequestMethod.POST)
	public ModelAndView removeNews(
			@PathVariable("id") Long id
			){
		//
		this.newsService.removeNews(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/news/list");
		return mav ;
	}
	
	/**
	 * 뉴스 조회
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView findNews(
			@PathVariable("id") Long id
			){
		//
		News news = this.newsService.findNews(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/news/newsView");
		mav.addObject("news", news);
		return mav;
	}
	
}