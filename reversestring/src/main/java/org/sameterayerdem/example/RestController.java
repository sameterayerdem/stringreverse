package org.sameterayerdem.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private Service service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView get(@RequestParam(name="input") String name,ModelAndView modelAndView)
	{  //control
		if(name!="")
		name=service.convert(name);
		modelAndView.addObject("value", name);
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
