package kr.whenever.controller.notice;

import java.util.List;

import kr.whenever.domain.Notice;
import kr.whenever.service.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value="/list",  method = RequestMethod.GET)
	public ModelAndView findNoticeList() {
		//
		List<Notice> notices = this.noticeService.findNoticeList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/notice/noticeList");
		mav.addObject("notices", notices);
		return mav;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String registerNoticeForm() {
		//
		return "/notice/noticeRegist";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registerNotice(
			Notice notice
			) {
		//
		this.noticeService.registerNotice(notice);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/notice/list");
		return mav;
	}
	
	@RequestMapping(value = "/{id}/modify", method = RequestMethod.GET)
	public ModelAndView modifyNoticeForm(
			@PathVariable(value = "id") Long id
			) {
		//
		Notice notice = this.noticeService.findNotice(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/notice/noticeModify");
		mav.addObject("notice", notice);
		return mav;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ModelAndView modifyNotice(
			@PathVariable(value = "id") Long id,
			Notice notice
			) {
		//
		this.noticeService.modifyNotice(notice);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/notice/list"); 
		return mav;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView findNotice(
			@PathVariable("id") Long id
			) {
		//
		Notice notice = this.noticeService.findNotice(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/notice/noticeView");
		mav.addObject("notice", notice);
		return mav;
	}
	
}
