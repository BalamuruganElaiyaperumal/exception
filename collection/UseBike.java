package collection;
import java.util.ArrayList;
public class UseBike {
public static void main (String[]args) {
	
Bike b1= new Bike("R15",200000,"Red",200);
Bike b2= new Bike("FZ",180000,"Blue",180);
Bike b3= new Bike("ducati",220000,"Orange",210);
Bike b4= new Bike("Pulsar",170000,"Blue",120);
Bike b5= new Bike("duke",22000,"Yellow",250);

ArrayList <Bike> bikes=new ArrayList<>();
bikes.add(b1);
bikes.add(b2);
bikes.add(b3);
bikes.add(b4);
bikes.add(b5);


               bikes.stream().filter(x->x.getColor().equals("blue")).forEach(x->System.out.println(x));










/*for (int i=0;i<bikes.size(); i++) {
	bikes.add(b1);

	if(bikes.get(i).getCC()> 200) {
		
		System.out.println(bikes.get(i).getBrand());
	}	
}	
ArrayList<Bike>highccBikes=new ArrayList<>();
  for(int i=0; i<bikes.size();i++) {
	if(bikes.get(i).getCC()>200) {
		highccBikes.add(bikes.get(i));
	}
}
  for(int i=0; i<highccBikes.size(); i++) {
	  System.out.println(highccBikes.get(i).getCC());
	  
  }

   for(Bike m:bikes) {
	   System.out.println(m);
   }*/

}
}