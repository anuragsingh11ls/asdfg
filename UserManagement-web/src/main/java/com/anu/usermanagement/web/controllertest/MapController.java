package com.anu.usermanagement.web.controllertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.google.ServerLocation;
import com.anu.usermanagement.google.ServerLocationBo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MapController {

	@Autowired
	ServerLocationBo serverLocationBo;

	@RequestMapping(value = "/maptest", method = RequestMethod.GET)
	public ModelAndView getPages() {

		ModelAndView model = new ModelAndView("pages/map");
		System.out.println("mapppppppppppppppppppppp");
		return model;

	}

	@RequestMapping(value = "/getLocationByIpAddress", method = RequestMethod.GET)
	public @ResponseBody
	String getDomainInJsonFormat(@RequestParam String ipAddress) {
		System.out.println("ttttttttttttttttttttttt");
		ObjectMapper mapper = new ObjectMapper();

		ServerLocation location = serverLocationBo.getLocation(ipAddress);

		String result = "";

		try {
			result = mapper.writeValueAsString(location);
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		return result;

	}

}
