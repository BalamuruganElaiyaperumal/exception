package excer;

public class Sportsshoe extends Shoe{
	String color;
	int  price;
	int size;
	
public  Sportsshoe(String brand,String type,String color,int price,int size) {

	
	super(brand,type);
	this.color=color;
	this.price=price;
	this.size=size;
	
}
public String toString() {
	
return color+","+price+","+size;	
	
}


}

