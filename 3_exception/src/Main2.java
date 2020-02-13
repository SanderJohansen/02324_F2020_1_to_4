import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("MyFile_W.txt");
			int character;
				while ((character = reader.read()) != -1) {
					System.out.print((char) character);
				}
		int taeller = 1;		
		int naevner = 1;
		double resultat = taeller/naevner;
		System.out.println("t�ller/n�vner = " + resultat);
		reader.close();		
		} 
		catch (FileNotFoundException e) {
			System.out.println("Filen ikke fundet springer til sidste linie og printer meddelse");
		} 
		catch (IOException e) {
			System.out.println("IO fejl som ikke er 'FileNotFoundException', springer til sidste linie og printer meddelse");
		}
		catch (ArithmeticException e) {
		System.out.println("DU M� IKKE DIVIDER MED NUL");
		}
		
		System.out.println("Programmet er slut");	
	}
}

/*
filen flyttes ind i workspace/projektet, der hvor default kataloget er. 
Vi beh�ver ingen sti projektet kan flyttes (eksporteres) 
Der indf�res en ny fejlmulighed ArithmeticException
*/

