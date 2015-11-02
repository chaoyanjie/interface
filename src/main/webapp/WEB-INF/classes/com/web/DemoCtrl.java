package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.common.ctrl.BaseCtrl;
@Controller
public class DemoCtrl extends BaseCtrl{
	 @RequestMapping(value = "/greet", method = RequestMethod.GET)
	  public String greetPath(ModelMap model) {
	    logger.debug("Method greetPath");
	    model.addAttribute("name", "index");
	    return "index";
	  }
}
