package bmi;

import bmi.IData.DataException;

public interface IFunk {
	double getBMI(String cpr) throws DataException; 
	String getTextualBMI(String cpr) throws DataException;
	String getNavn(String cpr)  throws DataException;
}
