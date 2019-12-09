package com.original.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.original.DAO.UserDAO;
import com.original.pojo.Login;
import com.original.pojo.User;

@Controller
public class RegistrationController {

	@Autowired
	private UserDAO userDAO;

	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@RequestMapping(value = "/registerForm")
	public ModelAndView registerForm() {
		ModelAndView model=new ModelAndView("Registration");
		model.addObject("user", new User());
		return model;
	}

	@RequestMapping("/login")
	public ModelAndView register(@ModelAttribute("user") User ca) {
		System.out.println(ca.getEmail());
		System.out.println(ca.getPassword());
		getUserDAO().register(ca);
		ModelAndView mav =new ModelAndView("login");
		mav.addObject("signIn", new Login());
		return mav;
	}
}
