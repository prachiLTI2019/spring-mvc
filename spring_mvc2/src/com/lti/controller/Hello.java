package com.lti.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello
{
		@RequestMapping(value="/hello",method= RequestMethod.GET)
		public ModelAndView sayHello()
		{
		ModelAndView model=new ModelAndView("helloWorld");
		model.addObject("message","Hello from spring MVC 2");
		return model;
		}
		
		@RequestMapping(value="/sayHello",method=RequestMethod.GET)
		public ModelAndView sayHelloToName(@RequestParam String name)
		{
			ModelAndView model =new ModelAndView("sayHello");
			model.addObject("name",name);
			model.addObject("date",new Date());
			return model;
					
		}
	 @RequestMapping(value="/evenOrOdd",method=RequestMethod.GET)
		public ModelAndView evenOdd(@RequestParam("num") int i)
		{
			ModelAndView model=new ModelAndView("evenOrOdd");
			
			String res; 
			if(i%2==0)
			{
				res="Even";
			}
			else
			{
				res="Odd";
			}
			model.addObject("res",res);
			return model;
		}
}









