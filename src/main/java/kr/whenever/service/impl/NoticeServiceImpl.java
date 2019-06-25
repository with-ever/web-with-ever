package kr.whenever.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.whenever.domain.Notice;
import kr.whenever.repo.NoticeRepository;
import kr.whenever.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeRepository noticeRepository;

	@Override
	public void registerNotice(Notice notice) {
		//
		this.noticeRepository.registerNotice(notice);
	}

	@Override
	public void modifyNotice(Notice notice) {
		//
		this.noticeRepository.modifyNotice(notice);;
	}

	@Override
	public void removeNotice(Long id) {
		//
		this.noticeRepository.removeNotice(id);
	}

	@Override
	public Notice findNotice(Long id) {
		//
		return this.noticeRepository.findNotice(id);
	}

	@Override
	public List<Notice> findNoticeList() {
		//
		return this.noticeRepository.findNoticeList();
	}

}
