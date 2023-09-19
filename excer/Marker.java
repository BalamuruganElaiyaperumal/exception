package excer;

public class Marker {
	String brand;
	int price;
	boolean isquality;
	
public Marker(String brand,int price,boolean isquality) {
	this.brand=brand;
	this.price=price;
	this.isquality=isquality;
}
public String toString() {
	return brand+","+price+","+isquality;
}
}
