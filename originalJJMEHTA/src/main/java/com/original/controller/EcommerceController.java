package com.original.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.original.DAO.EcommerceDAO;


@Controller
public class EcommerceController {
	@Autowired
	private EcommerceDAO e_dao;

	@RequestMapping("/products/{pro_type}")
	public ModelAndView data1(@PathVariable String pro_type) {
		ModelAndView mav = new ModelAndView("listMain", "products", e_dao.listDesign(pro_type));
		return mav;
	}
	@RequestMapping("/productdisplay/{prod_id}")
	public ModelAndView data1(@PathVariable int prod_id) {
		ModelAndView mav = new ModelAndView("listSub", "productsdisplay", e_dao.listProducts(prod_id));
		return mav;
	}
    
}