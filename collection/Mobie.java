package collection;
import java.util.ArrayList;
public class Mobie {
public static void main (String[]args) {
	
	ArrayList<Long> mobileNo =new ArrayList<>();
	mobileNo.add(9941547584l);
	mobileNo.add(8841547584l);
	mobileNo.add(7741547585l);
	mobileNo.add(6641547583l);
	mobileNo.add(5541547582l);
	mobileNo.add(4441547581l);

	System.out.println(mobileNo);
	System.out.println(mobileNo.get(3));
	System.out.println("======================================");
	for(int i=0; i<mobileNo.size(); i++) {
		
		System.out.println(mobileNo.get(i));	
	}
	System.out.println("======================================");
	for(Long s:mobileNo) {
		System.out.println(s);
		
	}

}
}
