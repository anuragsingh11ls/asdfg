/**
 * 
 */
package com.anu.usermanagement.web.controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Anurag Singh
 *
 */
@Controller
@RequestMapping("/stateWebservice")
public class WebServiceController {
	
	
	
	/*@RequestMapping(value = "/stateWebservice", method = RequestMethod.GET)
	public ModelAndView getPages() {

		ModelAndView model = new ModelAndView("pages/map");
		System.out.println("mapppppppppppppppppppppp");
		return model;

	}*/
	
	
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public  @ResponseBody String getState(@PathVariable String code) {
		System.out.println("ppppppppppppppppppppppppp"+code);
		String result;

		if (code.equals("k")) {

			result = "Kerala111111111";

		} else {

			result = "Default State";

		}

		return result;

	}
	

}
