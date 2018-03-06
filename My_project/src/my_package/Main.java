package my_package;
import my_package.Person;

public class Main {
	
	public static void main(String[] args) {
		
		//Deklaracja piêciu obiektów typu Person
		Person []osoba = new Person[5];
	
		
		for(int i=0;i<5;i++) {
		//Deklaracja osób
		osoba[i] = new Person();	

		osoba[i].age = i;
		osoba[i].name = "name";
		osoba[i].surname="surname";
		
			
		//Wyœwietlenie
		System.out.println(osoba[i].name);
		System.out.println(osoba[i].surname);
		System.out.println(osoba[i].age);
		}

	}

}
