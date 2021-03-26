package com.mindtree.capability.core.bean;

public class ProductDataBean {

	public String product_Name;
	public String product_Price;
	public String product_Description;
	public String product_PDP_Path;

	public ProductDataBean() {
	}

	public ProductDataBean(String product_Name, String product_Price, String product_Description,
			String product_PDP_Path) {
		super();
		this.product_Name = product_Name;
		this.product_Price = product_Price;
		this.product_Description = product_Description;
		this.product_PDP_Path = product_PDP_Path;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public String getProduct_Price() {
		return product_Price;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public String getProduct_PDP_Path() {
		return product_PDP_Path;
	}

}
