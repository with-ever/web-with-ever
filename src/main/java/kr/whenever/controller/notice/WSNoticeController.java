package kr.whenever.controller.notice;

import java.util.List;

import kr.whenever.domain.Notice;
import kr.whenever.service.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ws/notice")
public class WSNoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Notice> getNoticeList(){
		//
		List<Notice> notices = this.noticeService.findNoticeList();
		return notices;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Notice getNotice(
			@PathVariable(value = "id") Long id
			){
		//
		Notice notice = this.noticeService.findNotice(id);
		return notice;
	}
}
