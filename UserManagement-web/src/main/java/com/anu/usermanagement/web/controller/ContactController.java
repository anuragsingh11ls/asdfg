package com.anu.usermanagement.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anu.usermanagement.bean.ContactBean;

@Controller
public class ContactController {
	
	
	@RequestMapping("/contact")
	public String listContacts(ContactBean contactBean, BindingResult result) {

		//map.put("contact", new Contact());
		//map.put("contactList", contactService.listContact());

		return "contact";
	}
	
	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(ContactBean contactBean, BindingResult result) {

		//contactService.addContact(contact);

		return "redirect:/index";
	}*/

}
