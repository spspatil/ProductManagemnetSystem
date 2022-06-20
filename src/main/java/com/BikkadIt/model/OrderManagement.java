package com.BikkadIt.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class OrderManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	
	private String customername;
	
	private String productName;

	private double productPrice;
	private Integer quantity;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime orderdDate;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getOrderdDate() {
		return orderdDate;
	}
	public void setOrderdDate(LocalDateTime orderdDate) {
		this.orderdDate = orderdDate;
	}
	@Override
	public String toString() {
		return "OrderManagement [orderId=" + orderId + ", customername=" + customername + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", quantity=" + quantity + ", orderdDate=" + orderdDate + "]";
	}
	public OrderManagement(Integer orderId, String customername, String productName, double productPrice,
			Integer quantity, LocalDateTime orderdDate) {
		super();
		this.orderId = orderId;
		this.customername = customername;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.orderdDate = orderdDate;
	}
	public OrderManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
