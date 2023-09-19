package java8;

public interface ATM {

public static void pin() {
	
	System.out.println("1234");
}
public default int cash(int amount) {
	return amount;
}

}

