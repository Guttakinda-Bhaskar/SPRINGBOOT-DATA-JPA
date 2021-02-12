package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_tab")
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private String manufacturer;
	private double pcost;
	private float weight;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Product(Integer pid, String pname, String manufacturer, double pcost, float weight) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.manufacturer = manufacturer;
		this.pcost = pcost;
		this.weight = weight;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", manufacturer=" + manufacturer + ", pcost=" + pcost
				+ ", weight=" + weight + "]";
	}

}
