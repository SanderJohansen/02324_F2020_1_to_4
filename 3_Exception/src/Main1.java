import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// filens sti er "K:\02324F20\02324 Solutions 1 - 4\MyFile_w.txt"
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
			System.out.println("Her kan jeg også printe");
			e.printStackTrace();
		}
		System.out.println("Programmet er slut");
	}
	
}
		
//prøv at ændre filnavn
//2 fjern FileNotFoundException