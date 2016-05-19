package com.login.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.login.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Resource(name="loginDAO")
	LoginDAO loginDAO;
	
	@Override
	public List<Map<String, Object>> checkUser(Map<String, Object> map) {
		Object params="test_39";
		return loginDAO.checkUser(params);
	}
}
