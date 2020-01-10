// Lektion 1: Interface.gdoc
// opgaveformulering:
// https://docs.google.com/document/d/1lekJ-fXGnIYKNRSHWBDEFl3lNws-Be0aycDLtmOjvfw/edit?usp=sharing
// Dette løsningsforslag
// C:\Users\shog\Google Drive\DTU\# 02324\_02324 Tilgøngeligt på CN\Lektion 01\Opgaver\01stack.zip


//import java.util.LinkedList;
public class Main2 {
	public static Stak_tabel opretStak (int n){
		return new Stak_tabel(n);
	}

	public static void main(String[] args)
	{
		Stak_tabel s = opretStak (10);
		//Stak_list s = new Stak_list ();
		//Stak_list2 s = new Stak_list2 (); 
		//MyLinkedList s = new MyLinkedList();
		s.push("Dette");
		s.push("er");
		s.push("ene");
		s.show();
		s.push("mærkelig");
		s.push("sætning");
		//s.pop();
		s.vis();
		s.show();
		//		
//		System.out.println(s.pop());
//		System.out.println("");
//		
//		s.vis();
//		while (!s.tom())
//			System.out.println(s.pop());
//		System.out.println("****");
//		
//		s.vis();
	}
}
