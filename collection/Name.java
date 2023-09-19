package collection;
import java.util.ArrayList;
public class Name {
public static void main (String[]args) {
	
	ArrayList<String> names=new ArrayList<>();
	names.add("Bala");
	names.add("malai");
	names.add("raja");
	names.add("kalai");
	names.add("mano");
	
	for(String s:names) {
		
		System.out.println(s); //enhanced for loop
	}
	
for(int i=0; i<names.size(); i++) {
	
		System.out.println(names.get(i));	
}
	
	
	
}
}
