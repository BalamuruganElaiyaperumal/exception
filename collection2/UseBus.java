package collection2;
import java.util.HashMap;
import java.util.Iterator;

public class UseBus {
	public static void main (String[]args) {
		
		Bus b1 = new Bus ("14b","red",40,true);
		Bus b2 = new Bus ("23b","blue",40,true);
		Bus b3 = new Bus ("22a","pink",40,false);
		Bus b4 = new Bus ("10h","pink",40,true);
		Bus b5 = new Bus ("8B","red",40,false);
		
		HashMap<String,Bus>bushes=new HashMap<>();
		bushes.put(b1.getNo(),b1);
		bushes.put(b2.getNo(),b2);
		bushes.put(b3.getNo(),b3);
		bushes.put(b4.getNo(),b4);
		bushes.put(b5.getNo(),b5);
		
		bushes.keySet().forEach(x->{
			if(bushes.get(x).getColor().equals("red")) {
				//System.out.println(x);
				System.out.println(bushes.get(x));
			}
			});	
		  
		for(Bus b:bushes.values()) {
			if(b.getColor().equals("pink")) {
				
				System.out.println(b);
			}	
		}
		
		for(String s:bushes.keySet()) {
			if(bushes.get(s).getColor().equals("pink")) {
        System.out.println(bushes.get(s));
				
		}
		
	}

		bushes.forEach((x,y)->System.out.println(x+" "+y));
		
		
	HashMap<String,Bus>dieselbus=new HashMap<>();	
	
	bushes.keySet().forEach(x->{if(bushes.get(x).getIsDiesel()==true) {
		dieselbus.put(x,bushes.get(x));	
	}
	
	});
	
for(String m:dieselbus.keySet()) {
	System.out.println(bushes.get(m));
	System.out.println(m);
}


 Iterator <String > i=bushes.keySet().iterator();
 while(i.hasNext()) {
	 System.out.println(i.next());
 }
 
}
		}

