package composition;

public class UseCar {
	public static void main(String[]args) {
		
		Engine e1=new Engine ();
        e1.fuelType	="petrol";
        e1.cc=120;
        e1.price=4000;
		
		
		Car c1 = new Car();
		c1.brand="Boss";
		c1.price=50000;
		c1.color="black";
	    c1.engine=e1;
		System.out.println(c1.brand+" "+c1.price);
		System.out.println(c1.engine.price);
		
		
		
		
		
	}

}
