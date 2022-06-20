package com.BikkadIt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.Repository.AdminRepository;
import com.BikkadIt.Repository.CustomerRepository;
import com.BikkadIt.Repository.OrderRepository;
import com.BikkadIt.Repository.ProductRepository;
import com.BikkadIt.model.Admin;
import com.BikkadIt.model.Customer;
import com.BikkadIt.model.OrderManagement;
import com.BikkadIt.model.Product;
@Service
public class ServiceIMPL implements ServiceI{
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public boolean adminlogincheck(Admin admin) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		List<Admin> findAll = adminRepository.findAll();
		for (Admin ad : findAll) {
			
			if(admin.getUserName().equals(ad.getUserName()) && admin.getPassword().equals(ad.getPassword())) {
				
				flag=true;
				break;
			}
		}
		return flag;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		
		Product saveproduct = productRepository.save(product);
		return saveproduct;
	}

	@Override
	public List<Product> viewAllproduct() {
		// TODO Auto-generated method stub
		
		List<Product> findAll = productRepository.findAll();
		return findAll;
	}

	@Override
	public Product viewproductbyId(int productID) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productID).get();
		return product;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Customer save = customerRepository.save(customer);
		
		return save;
	}

	@Override
	public Customer custmerlogin(Customer customer) {
		// TODO Auto-generated method stub
		
		List<Customer> findAll = customerRepository.findAll();
		
			for (Customer ad : findAll) {
			
			if(customer.getName().equals(ad.getName()) && customer.getPassword().equals(ad.getPassword())) {
				
			Integer id = ad.getId();
			
			Customer customer2 = customerRepository.findById(id).get();
			return customer2;
				
			}
			
		}
		
		return new Customer();
	
	}

	@Override
	public OrderManagement saveorderTodb(OrderManagement orderManagement) {
		// TODO Auto-generated method stub
		
		double d=(orderManagement.getProductPrice())*(orderManagement.getQuantity());
		orderManagement.setProductPrice(d);
	
		OrderManagement saveorder = orderRepository.save(orderManagement);
	//	OrderRepository
		return saveorder;
	}
	
	

}
