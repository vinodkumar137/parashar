package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "home")
	public ModelAndView home(Alien alien) 
	{
		//HttpSession session = req.getSession();
		//String name =req.getParameter("name");
		ModelAndView mv = new ModelAndView();
				mv.addObject("obj",alien);
				System.out.println("created");
				mv.setViewName("home");
		//System.out.println("hi " + name);
		//session.setAttribute("name", name);
		return mv;
	}   
}
