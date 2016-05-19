package com.login.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
	
	public List<Map<String, Object>> checkUser(Map<String, Object> map);
}
