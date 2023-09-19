package excer;

public class Blackmarker extends Marker{
	String name;
	String color;
	
	public Blackmarker (String brand,int price,boolean isquality,String name,String color){
		super(brand,price,isquality);
		this.name=name;
		this.color=color;
		
	}
	public String toString() {
	
		return name+","+brand;
		
	}
	

}
