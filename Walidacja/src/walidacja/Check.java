package walidacja;

import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Check {
	Scanner scanner = new Scanner( System.in );
	
	public Boolean stringTest(String name) {
		if(name.length()>1 && name.length()<25) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)<64 || name.charAt(i)>90 && name.charAt(i)<61 || name.charAt(i)>122) {
					System.out.println("Wprowadzony zosta³ nie dozwolony znak, wprowadz litery");
					return false;
				}
			}
		}
		else {
			System.out.println("z³a d³ugoœæ textu");
			return false;
		}
		return true;
	}
	
	public Boolean peselTest(String name) {
		if(name.length()==11) {
		for(int i=0;i<11;i++) {
			if(name.charAt(i)<48 || name.charAt(i)>57) {
				System.out.println("Z³y znak");
				return false;
			}
		}
		return true;
	}
		else {
			System.out.println("Z³a d³ugoœæ peselu");
			return false;
		}
	}
	
	public String checkName(){
		System.out.print( "Type Name for the program: " );
		String name="";
		do{name=scanner.nextLine();
		} while(stringTest(name)==false);
		
		return name;
	}
	
	public String checkSurname() {
		System.out.print( "Type Surname for the program: " );
		String name="";
		do{name=scanner.nextLine();
		} while(stringTest(name)==false);
		
		return name;
		
	}
	
	public String checkPesel() {
		System.out.print( "Type Pesel for the program: " );		
		String name="";
		do {
			name=scanner.nextLine();
		}while(peselTest(name)==false);
		
		return name;
	}
	
	public String checkNip() {
		System.out.print( "Type Nip for the program: " );
		String name="";
		do {
			name=scanner.nextLine();
		}while(!Pattern.matches("^\\d{10}$", name));
		return name;
	}
	
	public String checkBankAccountNumber() {
		System.out.print( "Type BankAccountNumber for the program: " );
		String name="";
		do {
			System.out.println("Bank account number must be between 10-12 digits");
			name=scanner.nextLine();
		}while(!Pattern.matches("^\\d{10,12}$", name));
		return name;
	}
	
	public Date checkDateOfBirth() {
		System.out.println("Enter your date of birth in linux time XDD: ");
		int time=0;
		try {
			time=System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date = new Date(time);
		
		return date;
	}
	
}
