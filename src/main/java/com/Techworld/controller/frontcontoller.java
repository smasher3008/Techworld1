package com.Techworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Techworld.UserModel.User;
import com.Techworld.UserModel.UserService;
import com.Techworld.model.Product;
import com.Techworld.model.ProductService;


@Controller
public class frontcontoller 
{
	@Autowired
	ProductService ps;
	
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("In Index");
		
		return "index";
	}
	
	@RequestMapping("/index")
	public String index1()
	{
		System.out.println("In Index");
		
		return "index";
	}
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	   	public ModelAndView SignUpform(ModelMap model)
		{
			ModelAndView mav = new ModelAndView("SignUp");
			
			mav.addObject("User", new User());
			
	    	return mav;
		}
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	public ModelAndView SignUpSubmit()
	{
		ModelAndView mav = new ModelAndView("SignUp");
		
		mav.addObject("User", new User());
		
	    return mav;
	   }
	
	@RequestMapping(value = "/InsertUser", method = RequestMethod.POST)
	public ModelAndView InsertUser(@ModelAttribute("User")User u)
	{
		us.insert(u);
		
		ModelAndView mav = new ModelAndView("SignUp");
		
		mav.addObject("User", new User());
		
	    return mav;
	   }
	
	@RequestMapping(value = "/NewProduct", method = RequestMethod.GET)
   	public ModelAndView ProductSubmit()
	{
		ModelAndView mav = new ModelAndView("NewProduct");
		
		mav.addObject("Product", new Product());
		
    	return mav;
	}
	
	
	
	@RequestMapping(value = "/InsertProduct", method = RequestMethod.POST)
	public ModelAndView InsertProduct(@ModelAttribute("Product")Product p,Product pd)
	{
		ps.insert(p);
		ps.delete(pd);
		ModelAndView mav = new ModelAndView("NewProduct");
		
		mav.addObject("Product", new Product());
		
	    return mav;
	   }

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String loginurl() {

	   return "signin";

	}
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String loginurl1() {

	   return "signin";

	}
	
	@RequestMapping(value = "/logincheck", method = RequestMethod.GET)
	public String logincheck() {

	   return "signin";

	}
	
	

	
	/*@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("signin");

	  return model;

	}*/
	
	@RequestMapping("/AllProducts")
	public ModelAndView AllProducts()
	{
		
		List<Product> list = ps.list();
		
		String temp = "[";
		
		for( Product p:list )
		{
			temp += p.toString().replaceAll("\\\\","/") + ",";
		}
		
		if( temp.length() >1)
				temp = temp.substring(0, temp.length()-1);
		
			temp +="]" ;
		
			System.out.println(temp);
		
		ModelAndView mav = new ModelAndView();
		
		
		
		mav.addObject("JSONData",temp);
		
		return mav;
	}
}
