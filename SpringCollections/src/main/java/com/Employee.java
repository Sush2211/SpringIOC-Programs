package com;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	Set id;
	List name;
	Map designation;
	Properties address;
	public Set getId() {
		return id;
	}
	public void setId(Set id) {
		this.id = id;
	}
	public List getName() {
		return name;
	}
	public void setName(List name) {
		this.name = name;
	}
	public Map getDesignation() {
		return designation;
	}
	public void setDesignation(Map designation) {
		this.designation = designation;
	}
	public Properties getAddress() {
		return address;
	}
	public void setAddress(Properties address) {
		this.address = address;
	}
	
	
	

}
