package kr.whenever.controller.news;

import java.util.List;

import kr.whenever.domain.News;
import kr.whenever.service.NewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ws/news")
public class WSNewsController {
	
	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<News> getNewsList(){
		List<News> news = this.newsService.findNewsList();
		return news;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody News getNews(
			@PathVariable(value = "id") Long id
			){
		News news = this.newsService.findNews(id);
		return news;
	}
}