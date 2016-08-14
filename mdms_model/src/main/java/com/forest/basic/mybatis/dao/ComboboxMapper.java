package com.forest.basic.mybatis.dao;

import java.util.HashMap;
import java.util.List;

public interface ComboboxMapper {
	
	List<HashMap<String, Object>> queryAllRoleList(
			HashMap<String, Object> vo);	
}