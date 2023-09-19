package composition;

public class UseBus {
public static void main (String[]args) {
  
	Driver d1= new Driver();
	d1.name="raja";
	d1.age=25;
	d1.experience=5;
	
	
	Bus b1=new Bus();
	b1.name="pallvan";
	b1.cc=120;
	b1.isDiesel=true;
	b1.color="red";
	b1.price=20000;
	b1.driver=d1;
	
	System.out.println(b1.name+" "+b1.color+" "+b1.price);
	System.out.println(b1.driver.name+" "+b1.driver.age);
	
}
}
