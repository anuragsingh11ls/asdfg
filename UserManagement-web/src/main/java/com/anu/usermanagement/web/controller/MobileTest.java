package com.anu.usermanagement.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anu.usermanagement.bean.RegisterBean;
@Controller
public class MobileTest {
	

    @RequestMapping(value = "/mobileTest", method = RequestMethod.GET)
    public String showUserForm(RegisterBean registerBean,ModelMap map) {
    	System.out.println("mobile"); 
        return "mobileTest";
    }

}
