package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept2")
public class Deparment {

	@Id
	private Integer id;
	private String dname;
	@OneToMany
	@JoinColumn(name = "fkedId")
	private List<Employee> employees;
	public Deparment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deparment(Integer id, String dname, List<Employee> employees) {
		super();
		this.id = id;
		this.dname = dname;
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Deparment [id=" + id + ", dname=" + dname + ", employees=" + employees + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
