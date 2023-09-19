package encapulwithcompo;

public class UseBooks {
	public static void main (String[]args) {
		Books b1 = new Books();
		b1.setAuthor("vijay");
		b1.setName("ps1");
		
		
		Library l1 = new Library();
		l1.setLoc("chennai");
		l1.setNoOfBooks(80);
		l1.setNoOfRacks(8);
		l1.setBooks(b1);
		
		System.out.println(l1.getLoc()+" "+l1.getNoOfBooks()+" "+l1.getNoOfRacks());
		System.out.println(l1.getBooks().getName());
		
	}

}
