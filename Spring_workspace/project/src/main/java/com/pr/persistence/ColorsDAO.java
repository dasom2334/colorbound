package com.pr.persistence;

import java.util.List;
import java.util.Map;
import com.pr.domain.ColorsVO;


public interface ColorsDAO {
	
	public List<ColorsVO> find_zero(String string0) throws Exception;
	public List<ColorsVO> find_one(String string0, String string1) throws Exception;
	public List<ColorsVO> find_two(String string0, String string1, String string2) throws Exception;
	public List<ColorsVO> find_three(String string0, String string1, String string2, String string3) throws Exception;
	public List<ColorsVO> find_four(String string0, String string1, String string2, String string3, String string4) throws Exception;
	public List<ColorsVO> find_five(String string0, String string1, String string2, String string3, String string4, String string5) throws Exception;
	public List<ColorsVO> find_six(String string0, String string1, String string2, String string3, String string4, String string5, String string6) throws Exception;
	public List<ColorsVO> find_seven(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7) throws Exception;
	public List<ColorsVO> find_eight(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Exception;
	public List<ColorsVO> find_nine(String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws Exception;
}
