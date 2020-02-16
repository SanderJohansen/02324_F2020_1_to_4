package bmi;

import bmi.IData.DataException;

public class Funk implements IFunk {
	private IData data;

	public Funk(IData data){
		this.data = data;
	}
	
	public double getBMI(String cpr) throws DataException {
		double hoejde = data.getHoejde(cpr);
		double vaegt = data.getVaegt(cpr);
		double bmi = vaegt / (hoejde * hoejde);
		return bmi;
	}
	
	public String getTextualBMI(String cpr) throws DataException {
		double bmi = getBMI(cpr);
		String bmiStr = getNavn(cpr) + " vejer for lidt.";
		if ((bmi >= 18.5) && (bmi < 25))
			bmiStr = getNavn(cpr) + "'s vægt er passende.";
		if ((bmi >= 25) && (bmi <= 30))
			bmiStr = getNavn(cpr) + " er overvægtig.";
		if (bmi > 30)
			bmiStr = getNavn(cpr) + " er svært overvægtig.";
		return bmiStr;
	}
	
	public String getNavn(String cpr) throws DataException {
		return data.getNavn(cpr);
	}
}
