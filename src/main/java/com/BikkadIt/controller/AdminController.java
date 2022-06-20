package com.BikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BikkadIt.model.Admin;
import com.BikkadIt.model.Product;
import com.BikkadIt.service.ServiceI;

@Controller
public class AdminController {
	@Autowired
	private ServiceI ServiceI;
	
	@GetMapping("/welcome")
	public String loadEshop() {
		
		
		return "load_shop";
	}
	
	@GetMapping("/admin")
	public String admin() {
		
		return "logdetails";
	}
	@GetMapping("/logincheck")
	public String adminLogin(@ModelAttribute Admin admin,Model model) {
		
		boolean login = ServiceI.adminlogincheck(admin);
		
		if(login==true) {
		return "loginsucess";
		}
		
		return "loginFail";
	}
	@GetMapping("/productReg")
	public String productRegister() {
		
		return "productRegister";
	}
	@GetMapping("/saveProduct")
	public String addProduct(@ModelAttribute Product product,Model model) {
		
		Product addProduct = ServiceI.addProduct(product);
		model.addAttribute("addproduct", addProduct);
		return "savedaproduct";
	}

	@GetMapping("/viewALL")
	public String viewAllProduct(Model model) {
		List<Product> products=ServiceI.viewAllproduct();
		
		model.addAttribute("products", products);
		
	return "viewAllpro";	
	}
	

	@GetMapping("/viewidform")
	public String viewIdform() {
		
		return "viewbyIDform";
	}
	
	@GetMapping("/viewbyId")
	public String  viewProductByID(int productID,Model model) {
		
		System.out.println("==========="+productID);
		
		Product product =ServiceI.viewproductbyId(productID);
		model.addAttribute("product", product);
		return "viewbyId";
	}
}
