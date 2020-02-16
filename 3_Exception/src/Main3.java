import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
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
		
		try {
			FileReader reader = new FileReader(string);
			int character;
				while ((character = reader.read()) != -1) {
					System.out.print((char) character);
				}
		int taeller = 1;		
		int naevner = 0; // denne sættes til 0 når vi ønsker fejl
		double resultat = taeller/naevner;
		System.out.println("tæller/nævner = " + resultat);
		reader.close();	
		System.out.println("Nu er filen lukket");
		} 
		catch (FileNotFoundException e) {
			System.out.println("FileNotFound Objektet = " + e);
			//e.printStackTrace();
			
			System.exit(1);
			System.out.println("Filen ikke fundet på disken");
		} 
		catch (IOException e) {
			System.out.println("Her kan jeg printe");
			e.printStackTrace();
		}
		
	}
}

// start med fejlfrit program

// fil ikke fundet fint men filen bliver ikke lukket


//håndtering af div med nul flyttes ud af metoden 
// filen bliver ikke lukket ved fejl

