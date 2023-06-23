package com.vandelay.app.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupServiceImpl service;
	
	@RequestMapping("/codeGroupList")
	public String codeGroupList(Model model) {
		
//		List<CodeGroup> list = service.selectList();
//		model.addAttribute("list",list);
		
//		왼쪽의 list는 jsp에서 사용할 변수명
		model.addAttribute("list",service.selectList());
		return "codeGroupList";
	}
	
}
