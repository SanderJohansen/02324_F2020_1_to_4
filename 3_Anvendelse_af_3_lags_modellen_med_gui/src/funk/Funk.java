package funk;
import dal.IData;

public class Funk implements IFunk {
	private IData data;
	
	public Funk(IData Idata) {
		this.data= Idata;
	}
	
	public double getBMI(String cpr){
		return data.getVaegt(cpr)/(data.getHoejde(cpr)*data.getHoejde(cpr)); 
	} 
	
	public String getTextualBMI(String cpr) {
		double bmi = getBMI(cpr);
		String bmiStr = getNavn(cpr) + " vejer for lidt.";
		if ((bmi >= 18.5) && (bmi < 25))
			bmiStr = getNavn(cpr) + "'s v�gt er passende.";
		if ((bmi >= 25) && (bmi <= 30))
			bmiStr = getNavn(cpr) + " er overv�gtig.";
		if (bmi > 30)
			bmiStr = getNavn(cpr) + " er sv�rt overv�gtig.";
		return bmiStr;
	}
	
	public String getNavn(String cpr){
		return data.getNavn(cpr);
	} 
}
