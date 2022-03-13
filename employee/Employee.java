package com.greatlearning.employee;

public class Employee {
	 private String firtsname;
	 private String lastname;
	 
	public Employee(String firtsname, String lastname) {
		super();
		this.firtsname = firtsname;
		this.lastname = lastname;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	 

}
