import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		try {
		readfile("MyFile_W.txt");
		}
		catch (ArithmeticException e) {
			System.out.println("Du MÅ IKKE DIVIDER MED NUL");
			System.out.println(e.getMessage());
		}
		catch (MyLicenseException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Programmet er slut");	
	}

	private static void readfile(String string) throws ArithmeticException, MyLicenseException{
		FileReader reader = null;
		try {
			reader = new FileReader(string);
			int character;
				while ((character = reader.read()) != -1) {
					System.out.print((char) character);
				}
		int taeller = 100000000;		
		int naevner = 10;
		double resultat = taeller/naevner;
		if (resultat>10000) 
			throw new MyLicenseException(taeller, naevner);
		System.out.println("Dette printes aldrig");
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
			}
			catch (IOException e) {
			}
			System.out.println("Nu er filen lukket af finally");	
		}
	}
}
//