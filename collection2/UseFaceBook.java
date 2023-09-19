package collection2;
import java.util.HashMap;
public class UseFaceBook {
	public static void main(String[]args) {

		FaceBook f1 = new FaceBook(9945768675l,"1234@Ks","Bala","bal123@gamil.com");
		FaceBook f2 = new FaceBook(8845768674l,"HH4@Ks","Malai","kMLA23@gamil.com");
		FaceBook f3 = new FaceBook(6645768676l,"RAJKs","Rajini","KAMAL23@gamil.com");
		FaceBook f4 = new FaceBook(7745768678l,"17@Ks","kamal","rajes@gamil.com");
		FaceBook f5 = new FaceBook(9845768677l,"67234@Ks","vijay","vimal23@gamil.com");

		HashMap<Long,FaceBook>fb=new HashMap <>();
		fb.put(f1.getMobileNo(),f1);
		fb.put(f2.getMobileNo(),f2);
		fb.put(f3.getMobileNo(),f3);
		fb.put(f4.getMobileNo(),f4);
		fb.put(f5.getMobileNo(),f5);
		
		/*for(Long s:fb.keySet()) {
			System.out.println(s);
		}*/

	//fb.keySet().forEach(x->System.out.println(x));

	fb.values().forEach(y->System.out.println(y));
	}

}
