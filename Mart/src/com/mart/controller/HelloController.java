package com.mart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController{
 
  // @RequestMapping(method = RequestMethod.GET)
	@RequestMapping("/hello")
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
   @RequestMapping("/index" )
   public String index(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework! from index controller");
      return "index";
   }

}
