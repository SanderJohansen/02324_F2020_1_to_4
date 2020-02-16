package bmi;

import java.util.Scanner;

import bmi.IData.DataException;

public class Tui {
private IFunk funk;
	
	public Tui(IFunk funk){
		this.funk = funk;
	}
	
	public void dialog(){
		Scanner tastatur = new Scanner(System.in);
		String cpr = null;

		System.out.println("indtast cpr-nr: ");
			cpr = tastatur.nextLine().trim();
		 	
			try{
			System.out.println(funk.getNavn(cpr) + "'s bmi er: " 
						+ funk.getBMI(cpr));
			System.out.println(funk.getTextualBMI(cpr));
			}
			catch (DataException e){
				System.out.println("Personen findes ikke");
				
			}
			
			
			tastatur.close();		
	}
}
