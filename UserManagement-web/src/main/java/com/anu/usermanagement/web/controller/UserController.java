package com.anu.usermanagement.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.service.TestService;
import com.anu.usermanagement.service.UserService;

@Controller
public class UserController {

	@Autowired
	public TestService testService;
	
	@Autowired
	public UserService userService;
	
	

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showUserForm(RegisterBean registerBean,ModelMap map) {
    	 map.addAttribute("userList", userService.getAll(registerBean));
		
    	System.out.println("tytyty");
        return "register";
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView saveUser(@Valid RegisterBean registerBean,BindingResult result,ModelMap map) {
    	ModelAndView mv=new ModelAndView("register");
    	/*RegisterBean existing = userService.findByUserName(registerBean.getUserName());
        if (existing != null) {
            model.addAttribute("status", "exist");
            return mv;
        }*/
       
    	if (result.hasErrors()) {
    		System.out.println("am in error method");
    		return mv;
    	}else {
    		  userService.saveUser(registerBean);
    		  map.addAttribute("userList", userService.getAll(registerBean));
     	System.out.println("ttttttttt");
    	    	registerBean.setFirstName("");
    	    	registerBean.setLastName("");
    	    	registerBean.setPassword("");
    	    	registerBean.setUserName("");
    	        //model.addAttribute("saved", "success");
    	        return new ModelAndView("register");
		}
      }
    
    @RequestMapping("/delete/{employeeId}")
	public String deleteUser(@PathVariable("employeeId") Integer id)
	{
    	userService.deleteUser(id);
		return "redirect:/";
	}

    /*@RequestMapping(value = "/create", method = RequestMethod.POST)
    public String saveUser(@Valid RegisterBean registerBean,BindingResult result,Model model) {
    	
        User existing = userService.findByUserName(user.getUserName());
        if (existing != null) {
            model.addAttribute("status", "exist");
            return "index";
        }
        
    	if (result.hasErrors()) {
    		System.out.println("am in error method");
    		return "register";
    	}else {
    		  userService.saveUser(registerBean);
    	    	System.out.println("pppppppppppppppp");
    	        //model.addAttribute("saved", "success");
    	        return "register";
		}
    	
      
    }*/
    
    
    
    @RequestMapping(value = "/anurag", method = RequestMethod.GET)
    public String showUserForm1(Model model) {
    	String s=testService.Play();
       // model.addAttribute("user",new User());
    	System.out.println("aaaaaaaaaaaaaaaaaa"+s);
        return "country";
    }

   


}
