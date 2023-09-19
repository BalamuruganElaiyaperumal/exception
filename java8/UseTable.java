package java8;

public class UseTable {
	public static void main(String[]args) {
		
		
		Table t1 = new Table();
		System.out.println(t1.name());
		
		Table.color();
		System.out.println(Furniture.price("wood",4000));
	}

}
