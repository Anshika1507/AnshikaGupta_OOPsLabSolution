package com.greatlearning.credentialService;

import java.util.Random;

import com.greatlearning.employee.Employee;

public class CredentialService {
	public char[] generatePassword()
	{
		Random r = new Random();
		
		String capital_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&?";
		String values = capital_letters + small_letters + numbers + symbols;
		
		char[] password = new char[8];
		for(int i=0;i<8;i++) {
			password[i] = values.charAt(r.nextInt(values.length()));
			
		}
		return password;
		
	}
	
	public String generateEmailAddress(Employee emp, String department) {
		return(emp.getFirtsname().toLowerCase()+emp.getLastname().toLowerCase()+"@"+department.toLowerCase()+".abc.com"); 
	}
	
	public void showCredentials(Employee emp, String email, char[] generatedPassword){
		System.out.println("Dear "+emp.getFirtsname()+" your generated credentials are as follows:");
		System.out.println("Email  --->  "+email);
		System.out.println("Password  --->  "+generatedPassword);
		
		
	}

}
