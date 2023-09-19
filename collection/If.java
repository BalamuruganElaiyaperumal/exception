package collection;
import java.util.ArrayList;
public class If {
	public static void main(String[]args) {
		
		ArrayList <Integer> s=new ArrayList<>();
		s.add(6);
		s.add(40);
		s.add(36);
		s.add(5);
		s.add(30);
		s.add(50);
		s.add(60);
		s.add(59);
		
		for(int i=0; i<s.size(); i++) {
			if(s.get(i)>=35) {
				
				System.out.println(s.get(i));
			}
			
		}
		
	}

}
