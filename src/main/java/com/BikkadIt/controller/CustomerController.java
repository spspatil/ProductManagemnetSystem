package com.BikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.BikkadIt.model.Customer;
import com.BikkadIt.model.OrderManagement;
import com.BikkadIt.model.Product;
import com.BikkadIt.service.ServiceI;

@Controller
@SessionAttributes({"customerinfo","product"})
public class CustomerController {
	
	@Autowired
	private  ServiceI serviceI;
	
	@GetMapping("/customer")
	public String loadcustomer() {
		
		return "loadCustomer";
	}
	
	@GetMapping("/customerReg")
	public String registerform() {
		
		return "customerRegister";
	}
	
	@GetMapping("/SaveCustmer")
	public String custmerRegiser(@ModelAttribute Customer customer,Model model) {
		Customer saveCustomer=serviceI.addCustomer(customer);
		model.addAttribute("saveCustomer", saveCustomer);
		return "savedCustomer";
	}
	
	@GetMapping("/custmerlogincheck")
	public String customerLogin(@ModelAttribute Customer customer,Model model) {
		
	       Customer custmerlogin = serviceI.custmerlogin(customer);
		
	      if(custmerlogin.getName()==null) {
	   		return "custloginfail";
	      }
	      
	      model.addAttribute("customer", custmerlogin);
	      model.addAttribute("customerinfo", custmerlogin);
	      
	      return "custloginsucess";
	}
	@GetMapping("/tobuyProduct")
	public String toBuyproductlist(@ModelAttribute("customerinfo") Customer customer,Model model) {
		
		List<Product> allproduct = serviceI.viewAllproduct();
		
		model.addAttribute("products", allproduct);
		model.addAttribute("customerinfo",customer);
		
	return "viewtoBuy";	
	}
	@GetMapping("/addToCart{rd}")
	public String addtoCarttoBuy(@ModelAttribute("customerinfo") Customer customer,@RequestParam("rd")Integer productID,Model model) {
		Product product = serviceI.viewproductbyId(productID);
		
		model.addAttribute("product", product);
		
		model.addAttribute("customerinfo",customer);
	
		return "orderReview";
	}
	
	@GetMapping("/Saveorder{rd}")
	public String saveorder(@ModelAttribute("customerinfo")Customer customer,@ModelAttribute("product") Product product,@RequestParam("rd")Integer productID,Model model) {
	
		String productName1 = product.getProductName();
		OrderManagement orderManagement=new OrderManagement();
		orderManagement.setCustomername(customer.getName());
		orderManagement.setProductName(productName1);
		orderManagement.setProductPrice(product.getProductPrice());
		orderManagement.setQuantity(productID);
		System.out.println("===========----========order===="+orderManagement);
		
		OrderManagement order=serviceI.saveorderTodb(orderManagement);
		
		model.addAttribute("order",order);
		
		return "genratedbill";
	}

}
