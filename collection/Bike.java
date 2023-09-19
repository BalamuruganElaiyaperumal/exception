package collection;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private int cc;

public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(int price) {
 this.price=price;
}
public int getPrice() {
	return price;
	
}
public void setColor(String color) {
	this.color=color;
}
public String getColor() {
	return color;
}
public void  setCC(int cc) {
	this.cc=cc;
}
public int getCC() {
	return cc;
	
}
public Bike(String brand,int price,String color,int cc) {
	this.brand=brand;
	this.price=price;
	this.color=color;
	this.cc=cc;
	
}
@Override
public String toString() {
	return "Bike [brand=" + brand + ", price=" + price + ", color=" + color + ", cc=" + cc + "]";
}		
}


