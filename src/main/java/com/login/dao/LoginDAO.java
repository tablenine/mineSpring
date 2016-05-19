package com.login.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.common.dao.AbstractDAO;

@Repository("loginDAO")
public class LoginDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> checkUser(Object params) {
		return selectList("checkUser", params);
	}
	
}
