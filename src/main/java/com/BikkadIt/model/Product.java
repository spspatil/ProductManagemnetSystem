package com.BikkadIt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productID;
	
	private String productName;
	
	private double productPrice;
	
	private String productDescp;
	
	private String productCategory;
	
	private String mfg_Date;
	
	private String exp_Date;

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
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

	public String getProductDescp() {
		return productDescp;
	}

	public void setProductDescp(String productDescp) {
		this.productDescp = productDescp;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}



	public String getMfg_Date() {
		return mfg_Date;
	}

	public void setMfg_Date(String mfg_Date) {
		this.mfg_Date = mfg_Date;
	}

	public String getExp_Date() {
		return exp_Date;
	}
	
	public void setExp_Date(String exp_Date) {
		this.exp_Date = exp_Date;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescp=" + productDescp + ", productCategory=" + productCategory + ", mfg_Date=" + mfg_Date
				+ ", exp_Date=" + exp_Date + "]";
	}

	

	
	
	

}
