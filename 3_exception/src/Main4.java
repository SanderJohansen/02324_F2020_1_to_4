import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		try {
		readfile("MyFile_W.txt");
		}
		catch (ArithmeticException e) {
			System.out.println("DU MÅ IKKE DIVIDER MED NUL");
		}
		System.out.println("Programmet er slut");	
	}

	private static void readfile(String string) throws ArithmeticException {
		FileReader reader = null;
		try {
			reader = new FileReader(string);
			int character;
				while ((character = reader.read()) != -1) {
					System.out.print((char) character);
				}
		int taeller = 1;		
		int naevner = 1;
		double resultat = taeller/naevner;
		
		System.out.println("tæller/nævner = " + resultat);
		//reader.close();	
		//System.out.println("Nu er filen lukket");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Her kan jeg printe");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Her kan jeg printe");
			e.printStackTrace();
		}
		finally{
			try{
			reader.close();	
				System.out.println("Nu er filen lukket af finally");
			}
			catch (IOException e) {
			
				
		}
	}
}
}	
// der indføres finally, nu lukkes filen under alle forhold
// køres med og uden 0 i nævner



