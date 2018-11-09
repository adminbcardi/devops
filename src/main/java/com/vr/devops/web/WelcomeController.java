package com.vr.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String Welcome(Model model) {
		
		model.addAttribute("course","DEVOPS");
		return "index";
	}

}
