package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[]args) {
		try {
			
		File f = new File("");
		FileReader fr=new FileReader(f);
		int temp=0;
		
		while((temp= fr.read())!=0) {
			
			System.out.print((char)(temp));
		
		
		} 
		
	}catch (IOException fe) {
		System.out.println("we can't divide a number using ");
	}

			
	

}
}