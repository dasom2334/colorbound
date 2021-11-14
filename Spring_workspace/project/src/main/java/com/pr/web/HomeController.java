package com.pr.web;

import java.text.DateFormat;


import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pr.domain.Colors;
import com.pr.domain.ColorsVO;
import com.pr.service.ColorsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Inject
	private ColorsService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception  {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping(value = "/get0.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet0(Locale locale, Model model, ColorsVO vo, @RequestBody Colors colors) throws Exception {

		return (Map<String, Object>) service.find0(vo, colors.color0);
	}
	
	@RequestMapping(value = "/get1.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet1( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find1(vo, Colors.color0, Colors.color1);
	}
	
	@RequestMapping(value = "/get2.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet2( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find2(vo, Colors.color0, Colors.color1, Colors.color2);
	}
	
	@RequestMapping(value = "/get3.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet3( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {
		
		return (Map<String, Object>) service.find3(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3);
	}
	
	@RequestMapping(value = "/get4.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet4( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find4(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4);
	}
	
	@RequestMapping(value = "/get5.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet5( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find5(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4, Colors.color5);
	}
	
	@RequestMapping(value = "/get6.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet6( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find6(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4, Colors.color5, Colors.color6);
	}
	
	@RequestMapping(value = "/get7.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet7( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find7(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4, Colors.color5, Colors.color6, Colors.color7);
	}
	
	@RequestMapping(value = "/get8.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet8( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {

		return (Map<String, Object>) service.find8(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4, Colors.color5, Colors.color6, Colors.color7, Colors.color8);
	}
	
	@RequestMapping(value = "/get9.do",  method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody Map<String, Object> testGet9( Locale locale, Model model, ColorsVO vo,@RequestBody Colors Colors) throws Exception {
		
		return (Map<String, Object>) service.find9(vo, Colors.color0, Colors.color1, Colors.color2, Colors.color3, Colors.color4, Colors.color5, Colors.color6, Colors.color7, Colors.color8, Colors.color9);
	}
	
}
