package bmi;

public interface IData {
	String getNavn(String cpr) throws DataException;
	double getVaegt(String cpr)throws DataException;
	double getHoejde(String cpr)throws DataException;


	public class DataException extends Exception {
		private static final long serialVersionUID = 3184201770220225838L;
		public DataException(){ 	
		super ();
		}
	}


}


