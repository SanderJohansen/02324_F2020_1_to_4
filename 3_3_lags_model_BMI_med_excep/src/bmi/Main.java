// Lektion 3: .gdoc
// opgaveformulering:
// 
// Dette løsningsforslag
// "C:\Users\shog\Google Drive\DTU\# 02324\_02324 Tilgængeligt på CN\Lektion 03\Opgaver\03_bmi_excep.zip"
// https://drive.google.com/drive/folders/0B-pPbZ8YwfkFMmVqb09HNzRHWWs?usp=sharing


package bmi;

public class Main {
	public static void main(String[] args) {
//		IData d = new Data(); 		// implementering af IData
//		IFunk f = new Funk(d); 		// implementering af IFunk
//		Tui g = new Tui(f);
//		g.dialog();
		
		new Tui(new Funk(new Data())).dialog();
	}
}
