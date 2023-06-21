package com.vandelay.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/")
	public String home() {
//		서버 필요작업 수행 여기서부터
		return "home";
	}
	
	@RequestMapping(value="/home2")
	public String home2() {
		return "app/home/home2";		
	}
	
	@RequestMapping(value="/home3")
	public String home3() {
		return "app/home/home3";
	}
	
	@RequestMapping(value="/home4")
	public String home4() {
		return "app/home/home4";
	}
	
	@RequestMapping(value="/home5")
	public String home5() {
		return "app/home/home5";
	}
	
	@RequestMapping(value="/home6")
	public String home6() {
		return "app/home/home6";
	}
	
	@RequestMapping(value="/home7")
	public String home7() {
		return"/app/home/home7";
	}
	@RequestMapping(value="/home8")
	public String home8() {
		return"/app/home/home8";
	}
	
	@RequestMapping(value="/home9")
	public String home9() {
		return "/app/home/home9";
	}
	@RequestMapping(value="/home10")
	public String home10() {
		return "/app/home/home10";
	}
	
}
