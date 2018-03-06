package demos;


public class Main {

	public static void main(String[] args) {
		Car car = new Car("BMW", true, 0, 10000.99);
		car.printCar();
		System.out.println("Zmiana Wartoœci: ....");
		
		car.setMilleage(100);
		
		System.out.println("nowy przebieg: " + car.getMilleage());
	}

}
