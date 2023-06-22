package com.vandelay.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/")
	public String home() {
//		서버 필요작업 수행 여기서부터
		
		
//		href="/resources/xdm/v1/css/commonXdm.css"
		return "home";
	}
	
	@RequestMapping(value="/home3")
	public String home3() {
		return "app/home/home3";		
	}
	
	@RequestMapping(value="/loginForm")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("app/login/loginForm");
		return mav;
	}

	@RequestMapping(value="/main")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("app/main/main");
		return mav;
	}
	
	@RequestMapping(value="/home13")
	public ModelAndView home13() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home13");
		return mav;
	}
}
