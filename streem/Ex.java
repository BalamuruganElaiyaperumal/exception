package streem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex {
public static void main(String[]args) {
	
	ArrayList<Integer> values=new ArrayList<>();
	values.add(10);
	values.add(20);
	values.add(30);
	values.add(40);
	values.add(50);
	values.add(60);
	values.add(70);
	values.add(80);
	values.add(90);
	values.add(100);

	values.stream().filter(x->x>50).forEach(x->System.out.println(x));
	
	List<Integer>z=values.stream().filter(x->x>50).collect(Collectors.toList());
	Set<Integer>y=values.stream().filter(x->x<50).collect(Collectors.toSet());
	z.forEach(n->System.out.println(n));
	y.forEach(o->System.out.println(o));
	
}
}
