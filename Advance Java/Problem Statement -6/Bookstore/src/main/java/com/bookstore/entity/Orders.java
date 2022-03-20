package com.bookstore.entity;

import java.sql.Timestamp;

public class Orders {
	
	int order_id;
	String address;
	int mobileno;
	String name;
	Timestamp orderdate;
	int quantity;
	
	public Orders(String address, int mobileno, String name) {
		super();
		this.address = address;
		this.mobileno = mobileno;
		this.name = name;
	}
	public Orders(int order_id, String address, int mobileno, String name,int quantity) {
		super();
		this.order_id = order_id;
		this.address = address;
		this.mobileno = mobileno;
		this.name = name;
		this.quantity = quantity;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", address=" + address + ", mobileno=" + mobileno + ", name=" + name
				+ ", orderdate=" + orderdate + ", quantity=" + quantity + "]";
	}

	
	

}
