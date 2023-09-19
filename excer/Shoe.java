package excer;

public class Shoe {
	
	String brand;
	String type;

	public  Shoe(String brand,String type) {
		this.brand=brand;
		this.type=type;
	}
	public String toString() {
		return brand+","+type;
	}


}
