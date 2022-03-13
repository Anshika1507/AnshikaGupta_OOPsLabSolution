package com.greatlearning.EmployeeOperation;

import java.util.Scanner;

import com.greatlearning.credentialService.CredentialService;
import com.greatlearning.employee.Employee;

public class EmployeeOperation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee emp = new Employee("Harshit","Choudhary");
		
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		CredentialService cs = new CredentialService();
		//String s = String.valueOf(cs.generatePassword(8));
		String generatedEmail;
		char[] generatedPassword;
		
		int department = scanner.nextInt();
		switch(department)
		{
		case 1:
			generatedEmail = cs.generateEmailAddress(emp, "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, generatedPassword);
			break;
			
		case 2:
			generatedEmail = cs.generateEmailAddress(emp, "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, generatedPassword);
			break;

		case 3:
			generatedEmail = cs.generateEmailAddress(emp, "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, generatedPassword);
			break;

		case 4:
			generatedEmail = cs.generateEmailAddress(emp, "leg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, generatedPassword);
			break;
			
		default:
			System.out.println(".....Invalid Choice.....");
			break;

		}
		scanner.close();
	}

}
