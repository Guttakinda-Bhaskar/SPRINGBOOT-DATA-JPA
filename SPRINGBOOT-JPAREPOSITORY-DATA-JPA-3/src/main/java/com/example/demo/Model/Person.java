package com.example.demo.Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	private Integer pid;
	private String pname;
	private String address;
	private String state;
	 
	@ElementCollection
	@JoinColumn(name = "fk_pid")
	private List<String> nickNames;
	
	@ElementCollection
	private Set<String> phoneNumbers;
	
	@ElementCollection
	@JoinColumn(name ="cwn_fk")
	private Map<String, Integer> cardsWithNumber;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(Integer pid, String pname, String address, String state, List<String> nickNames,
			Set<String> phoneNumbers, Map<String, Integer> cardsWithNumber) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.state = state;
		this.nickNames = nickNames;
		this.phoneNumbers = phoneNumbers;
		this.cardsWithNumber = cardsWithNumber;
	}

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public List<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Integer> getCardsWithNumber() {
		return cardsWithNumber;
	}

	public void setCardsWithNumber(Map<String, Integer> cardsWithNumber) {
		this.cardsWithNumber = cardsWithNumber;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + ", state=" + state + ", nickNames="
				+ nickNames + ", phoneNumbers=" + phoneNumbers + ", cardsWithNumber=" + cardsWithNumber + "]";
	}

	
	
}
