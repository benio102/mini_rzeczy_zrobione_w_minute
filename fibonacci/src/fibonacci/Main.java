package fibonacci;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	

	public static long fibonacci(int miejsce) {
		long fib_value=0;
		if(miejsce == 0) return 1;
		if (miejsce == 1) return 1;
		else fib_value = fibonacci(miejsce-1) + fibonacci(miejsce-2);
		return fib_value;
	}
	
	public static void main(String[] args) {
		//Deklaracja scannera
		Scanner scanner = new Scanner(System.in);
		
		//Wprowadzenie wartoœci
		System.out.println("Wprowadz miejsce ciagu fibonacci'ego: ");
		int value = scanner.nextInt();
		scanner.close(); //Otherwise there is 'resource leak' warning
		
		//Fibonacci
		System.out.println("Fibbonacci value at: " + value + " is: " + fibonacci(value) + " \\Note that values are read from 0");
		
		//Fibonacci array
		ArrayList<Integer> fibonacciList = new ArrayList<>();
		
		//Create and show contents of the array
		System.out.println("Fibonacci Array: \n");
		for(int i=0;i<=value;i++) {
			fibonacciList.add((int) fibonacci(i));
		}
		System.out.println(fibonacciList);
		
		//Create and show a normal array
		System.out.println("A normal array: \n");
		int[] fibonacciArray = new int[value+1]; //+1 because i'm retarded
		
		for(int i=0;i<=value;i++) {
			fibonacciArray[i]=(int) fibonacci(i);
			System.out.print(fibonacciArray[i] + ", ");
		}
		
	}

}
