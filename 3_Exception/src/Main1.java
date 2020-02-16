import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("MyFile_w.txt");
			int character;
				while ((character = reader.read()) != -1) {
					System.out.print((char) character);
				}
			reader.close();		
		} 

		catch (FileNotFoundException e) {
			System.out.println("Her kan jeg printe");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Her kan jeg ogs� printe");
			e.printStackTrace();
		}
		System.out.println("Programmet er slut");
	}
	
}
		
/*
~\02324 Solutions 1 - 4\
*/
