package streem;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Stream1 {
	public static void main(String[]args) {
		
		ArrayList<String> names =new ArrayList<>();
		names.add("raja");
		names.add("mano");
		names.add("ragu");
		names.add("mani");
		names.add("malai");
		
		names.stream().filter(x->x.startsWith("r")).forEach(x->System.out.println(x));
	List<String>a = names.stream().filter(b->b.endsWith("a")).collect(Collectors.toList());
	}

}
