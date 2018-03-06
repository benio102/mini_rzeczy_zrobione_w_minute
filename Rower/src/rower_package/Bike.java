package rower_package;

public class Bike {
	private String type;
	private int height;
	private int width;
	private String color;
	
	//Konstruktor 
	Bike(String type, String color, int height, int width){
		this.type = type;
		this.color = color;
		this.height = height;
		this.width = width;
	}
		public String toString() {
			return "Bike [color= " + color + " type= " + type + " width= " + width + " Height= "+ height;
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
