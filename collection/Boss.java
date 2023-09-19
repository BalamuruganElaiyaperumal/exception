package collection;
import java.util.ArrayList;
public class Boss {
	public static void main(String[]args) {
		ArrayList<Integer> di = new ArrayList<>();
		di.add(10);
		di.add(20);
		di.add(30);
		di.add(40);
		di.add(50);
		di.add(60);
    di.forEach(x->System.out.println(x));
		
	}

}
