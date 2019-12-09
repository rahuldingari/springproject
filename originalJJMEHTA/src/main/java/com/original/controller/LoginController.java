package com.original.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.original.DAO.LoginDAO;
import com.original.pojo.Login;
@Controller
public class LoginController {
	@Autowired
	private LoginDAO loginDAO;

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	@RequestMapping(value = "/loginForm")
	public ModelAndView signInForm() {
		
		ModelAndView model=new ModelAndView("login");
		model.addObject("signIn", new Login());
		return model;

	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("signIn") Login si) {
		
		System.out.println(si.getPassword());
		
		boolean res = getLoginDAO().login(si);
		if (res == true) {
			System.out.println("ihihi");
			ModelAndView mav = new ModelAndView("hello");
			return mav;
		}
		return null;
	}

}


