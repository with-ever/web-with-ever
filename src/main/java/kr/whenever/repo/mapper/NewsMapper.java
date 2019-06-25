package kr.whenever.repo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.whenever.domain.News;

public interface NewsMapper {

	void insertNews(News news);

	void updateNews(News news);
	
	void deleteNews(@Param("id") Long id);
	
	News selectNews(@Param("id") Long id);

	List<News> selectNewsList();
}
