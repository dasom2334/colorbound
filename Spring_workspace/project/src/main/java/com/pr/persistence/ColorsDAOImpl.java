package com.pr.persistence;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.pr.domain.ColorsVO;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.pr.domain.ColorsVO;

@Repository
public class ColorsDAOImpl implements ColorsDAO {
	

	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.pr.mapper.colorMapper";

	@Override
	public List<ColorsVO> find_zero(String color0) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_zero", paramMap);
	}
	
	
	@Override
	public List<ColorsVO> find_one(String color0, String color1) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_one", paramMap);
	}
	
	@Override
	public List<ColorsVO> find_two(String color0, String color1, String color2) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_two", paramMap);
	}
	
	public List<ColorsVO> find_three(String color0, String color1, String color2, String color3) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_three", paramMap);
	}
	
	public List<ColorsVO> find_four(String color0, String color1, String color2, String color3, String color4) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_four", paramMap);
	}
	
	public List<ColorsVO> find_five(String color0, String color1, String color2, String color3, String color4, String color5) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		paramMap.put("color5", color5);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_five", paramMap);
	}
	
	public List<ColorsVO> find_six(String color0, String color1, String color2, String color3, String color4, String color5, String color6) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		paramMap.put("color5", color5);
		paramMap.put("color6", color6);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_six", paramMap);
	}
	
	public List<ColorsVO> find_seven(String color0, String color1, String color2, String color3, String color4, String color5, String color6, String color7) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		paramMap.put("color5", color5);
		paramMap.put("color6", color6);
		paramMap.put("color7", color7);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_seven", paramMap);
	}
	
	public List<ColorsVO> find_eight(String color0, String color1, String color2, String color3, String color4, String color5, String color6, String color7, String color8) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		paramMap.put("color5", color5);
		paramMap.put("color6", color6);
		paramMap.put("color7", color7);
		paramMap.put("color8", color8);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_eight", paramMap);
	}
	
	public List<ColorsVO> find_nine(String color0, String color1, String color2, String color3, String color4, String color5, String color6, String color7, String color8, String color9) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("color0", color0);
		paramMap.put("color1", color1);
		paramMap.put("color2", color2);
		paramMap.put("color3", color3);
		paramMap.put("color4", color4);
		paramMap.put("color5", color5);
		paramMap.put("color6", color6);
		paramMap.put("color7", color7);
		paramMap.put("color8", color8);
		paramMap.put("color9", color9);
		
		return sqlSession.selectList("com.pr.mapper.colorMapper.find_nine", paramMap);
	}
	
}

