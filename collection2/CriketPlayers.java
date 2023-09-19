package collection2;
import java.util.HashMap;
public class CriketPlayers {
public static void main (String[]args) {
	HashMap<Integer,String>players=new HashMap<>();
	players.put(1,"kamal");
	players.put(2,"raja");
	players.put(3,"malai");
	players.put(4,"rajini");
	players.put(5,"vijay");
	
	for(Integer s:players.keySet()) {

		System.out.println(s);
		System.out.println(players.get(s));
	}
	for (String m:players.values()) {
		System.out.println(players.get(m));
		
	}
		
	
	
}
}
