package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author User
 *
 */
@Entity
@Table(name = "comapny_tab")
public class CompanyDto {

	@Id
	@GeneratedValue
	private int id;
	private String companyName;
	private String location;
	public CompanyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyDto(int id, String companyName, String location) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", companyName=" + companyName + ", location=" + location + "]";
	}

	
}
