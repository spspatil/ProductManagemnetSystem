package com.BikkadIt.service;

import java.util.List;

import com.BikkadIt.model.Admin;
import com.BikkadIt.model.Customer;
import com.BikkadIt.model.OrderManagement;
import com.BikkadIt.model.Product;

public interface ServiceI {
	
	public boolean adminlogincheck(Admin admin);
	
	public Product addProduct(Product product);

	public List<Product> viewAllproduct();

	public Product viewproductbyId(int productID);

	public Customer addCustomer(Customer customer);

	public Customer custmerlogin(Customer customer);

	public OrderManagement saveorderTodb(OrderManagement orderManagement);

	
	
	



}
