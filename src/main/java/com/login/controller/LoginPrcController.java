package com.login.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.service.LoginService;

@Controller
public class LoginPrcController {
	Logger log = Logger.getLogger(this.getClass());
	@Resource(name="loginService")
	LoginService loginService;
	
	@RequestMapping(value="/login.tb")
	ModelAndView login(Map<String, Object> commandMap){
		ModelAndView mv = new ModelAndView();
		
		log.debug(commandMap.get("id"));
		log.debug(commandMap.get("pswd"));
		
//		loginService.checkUser(commandMap);
//		mv.setViewName("home");
		
		return mv;
	}
	
}
