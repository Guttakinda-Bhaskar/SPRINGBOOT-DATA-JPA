package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Deparment {

	@Id
	private Integer id;
	private String dname;

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

	public Deparment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deparment(Integer id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Deparment [id=" + id + ", dname=" + dname + "]";
	}

}
