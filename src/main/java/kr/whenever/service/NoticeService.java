package kr.whenever.service;

import java.util.List;

import kr.whenever.domain.Notice;

public interface NoticeService {
	
	void registerNotice(Notice notice);
    
	void modifyNotice(Notice notice);
	
	void removeNotice(Long id);
	
	Notice findNotice(Long id);
    
	List<Notice> findNoticeList();

}
