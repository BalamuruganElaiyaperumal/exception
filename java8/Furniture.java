package java8;

public interface Furniture {
	
	public static int pricr(String material,int price) {
		
		if(material.equals("wood")) {
			return price+1000;
			
		}
		else {
			return price;
			
		}
		public String name();
	}

}
