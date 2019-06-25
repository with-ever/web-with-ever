package kr.whenever.service;

import java.util.List;

import kr.whenever.domain.News;

public interface NewsService {
	
	void registerNews(News news);
	
	void modifyNews(News news);
	
	void removeNews(Long id);
	
	News findNews(Long id);

	List<News> findNewsList();

}
