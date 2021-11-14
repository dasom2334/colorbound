package com.pr.service;

import java.util.*;
import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pr.domain.ColorsVO;
import com.pr.persistence.ColorsDAO;

@Service
public class ColorsServiceImpl implements ColorsService {

	@Inject
	private ColorsDAO dao;

	@Override
	public List<ColorsVO> find_zero(String string0) throws Exception {
		return dao.find_zero(string0);
	}
	
	@Override
	public List<ColorsVO> find_one(String string0, String string1) throws Exception {
		return dao.find_one(string0, string1);
	}
	
	@Override
	public List<ColorsVO> find_two(String string0, String string1, String string2) throws Exception {
		return dao.find_two(string0, string1, string2);
	}
	
	@Override
	public List<ColorsVO> find_three(String string0, String string1, String string2, String string3) throws Exception {
		return dao.find_three(string0, string1, string2, string3);
	}
	
	@Override
	public List<ColorsVO> find_four(String string0, String string1, String string2, String string3, String string4) throws Exception {
		return dao.find_four(string0, string1, string2, string3, string4);
	}
	
	@Override
	public List<ColorsVO> find_five(String string0, String string1, String string2, String string3, String string4, String string5) throws Exception {
		return dao.find_five(string0, string1, string2, string3, string4, string5);
	}
	
	@Override
	public List<ColorsVO> find_six(String string0, String string1, String string2, String string3, String string4, String string5, String string6) throws Exception {
		return dao.find_six(string0, string1, string2, string3, string4, string5, string6);
	}
	
	@Override
	public List<ColorsVO> find_seven(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7) throws Exception {
		return dao.find_seven(string0, string1, string2, string3, string4, string5, string6, string7);
	}
	
	@Override
	public List<ColorsVO> find_eight(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Exception {
		return dao.find_eight(string0, string1, string2, string3, string4, string5, string6, string7, string8);
	}
	
	@Override
	public List<ColorsVO> find_nine(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws Exception {
		return dao.find_nine(string0, string1, string2, string3, string4, string5, string6, string7, string8, string9);
	}
	
	
	
	@Override
	public Map<String, Object> find0(ColorsVO vo, String string0) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_zero(string0));
		
		return map;
	}	
	
	@Override
	public Map<String, Object> find1(ColorsVO vo, String string0, String string1) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_one(string0, string1));
		
		return map;
	}
	
	@Override
	public Map<String, Object> find2(ColorsVO vo, String string0, String string1, String string2) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_two(string0, string1, string2));
		
		return map;
	}
	
	@Override
	public Map<String, Object> find3(ColorsVO vo, String string0, String string1, String string2, String string3) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_three(string0, string1, string2, string3));
		
		return map;
	}
	@Override
	public Map<String, Object> find4(ColorsVO vo, String string0, String string1, String string2, String string3, String string4) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_four(string0, string1, string2, string3, string4));
		
		return map;
	}
	@Override
	public Map<String, Object> find5(ColorsVO vo, String string0, String string1, String string2, String string3, String string4, String string5) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_five(string0, string1, string2, string3, string4, string5));
		
		return map;
	}
	@Override
	public Map<String, Object> find6(ColorsVO vo, String string0, String string1, String string2, String string3, String string4, String string5, String string6) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_six(string0, string1, string2, string3, string4, string5, string6));
		
		return map;
	}
	@Override
	public Map<String, Object> find7(ColorsVO vo, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", find_seven(string0, string1, string2, string3, string4, string5, string6, string7));
		
		return map;
	}
	@Override
	public Map<String, Object> find8(ColorsVO vo, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_eight(string0, string1, string2, string3, string4, string5, string6, string7, string8));
		
		return map;
	}
	@Override
	public Map<String, Object> find9(ColorsVO vo, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();		
		
		map.put("list", dao.find_nine(string0, string1, string2, string3, string4, string5, string6, string7, string8, string9));
		
		return map;
	}
}