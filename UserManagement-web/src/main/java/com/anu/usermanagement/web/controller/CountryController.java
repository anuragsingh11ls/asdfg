package com.anu.usermanagement.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.bean.CountryBean;
import com.anu.usermanagement.service.CountryService;

/**
 * This class treated as a controller <br>
 * 
 */
@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	List<String> l1 = new ArrayList<String>();
	List<Object> l = new ArrayList<Object>();

	@RequestMapping(value = "/countryPage", method = RequestMethod.GET)
	public final ModelAndView countryHome(final ModelMap map,
			final CountryBean countryBean) {
		// model.addAttribute("user",new User());
		ModelAndView mv = new ModelAndView("country");
		// List l=countryService.getAll(countryBean);

		/*
		 * // List l=new ArrayList(); l.add(countryService.getAll(countryBean));
		 * for (Object obj:l) {
		 * 
		 * l1.add(((CountryBean) obj).getCountryName()); }
		 */
		// mv.addObject("countryList", countryService.getAll(countryBean));

		map.addAttribute("countryList", countryService.getAll());

		System.out.println("klll");

		return mv;
	}

}
