package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	private Integer id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "fkedId")
	private Deparment deparments;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, Deparment deparments) {
		super();
		this.id = id;
		this.name = name;
		this.deparments = deparments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Deparment getDeparments() {
		return deparments;
	}

	public void setDeparments(Deparment deparments) {
		this.deparments = deparments;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deparments=" + deparments + "]";
	}

}
