package demos;

public class Car {
	private String marka;
	private Boolean stan;
	private int przebieg;
	private double cena;
	
	public String getBrand() {
		return marka;
	}
	
	public boolean isNew() {
		return stan;
	}
	
	public int getMilleage() {
		return przebieg;
	}
	
	public void setMilleage(int przebieg) {
		this.przebieg = przebieg;
	}
	
	public double getPrice() {
		return cena;
	}
	
	public void setPrice(double cena) {
		this.cena = cena;
	}
	
	//Konstruktor
	Car(String marka, boolean stan, int przebieg, double cena){
		this.marka = marka;
		this.stan = stan;
		this.przebieg = przebieg;
		this.cena = cena;
		
		
	}
	
	void printCar() {
		
		System.out.println("Marka: " + marka);
		System.out.println("Nowy?: " + stan);
		System.out.println("Przebieg: " + przebieg);
		System.out.println("Cena: " + cena);
	}
	
}
