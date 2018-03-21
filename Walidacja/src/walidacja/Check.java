package walidacja;

import java.sql.Date;
import java.util.Scanner;

public class Check {
	Scanner scanner = new Scanner( System.in );
	
	public void stringTest(String name) {
		Boolean valid = false;
		if(name.length()>0 && name.length()<25) {
		while(valid==false) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)<64 || name.charAt(i)>90) break; 
			}
		}
		}
		else {
			
		}
	}
	
	public String checkName(){
		System.out.print( "Type Name for the program: " );
		String name=scanner.nextLine();
		return name;
	}
	
	public String checkSurname() {
		System.out.print( "Type Surname for the program: " );
		String name=scanner.nextLine();
		return name;
	}
	
	public String checkPesel() {
		System.out.print( "Type Pesel for the program: " );
		String name=scanner.nextLine();
		Boolean valid = false;
		while(valid==false) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)<64 || name.charAt(i)>90) break; 
			}
		}
		return name;
	}
	
	public String checkNip() {
		System.out.print( "Type Nip for the program: " );
		String name=scanner.nextLine();
		return name;
	}
	
	public String checkBankAccountNumber() {
		System.out.print( "Type BankAccountNumber for the program: " );
		String name=scanner.nextLine();
		return name;
	}
	
	public Date checkDateOfBirth() {
		@SuppressWarnings("deprecation")
		Date date = new Date(10,10,10);
		return date;
	}
	
}
