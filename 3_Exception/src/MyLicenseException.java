class MyLicenseException extends Exception{
	private static final long serialVersionUID = 1L;
	private int taeller;
	private int naevner;
	
	public MyLicenseException(int taeller,int naevner){
		super("T�ller = "+ taeller + "  N�vner = " + naevner + " Resultatet er st�rre end 10000 du skal betale licens ");
		this.taeller =taeller;	
		this.naevner =naevner;
		
	}
	// Override the "toString" method
	   public String toString(){  
		   return "T�ller = "+ taeller + "  N�vner = " + naevner + " Resultatet er st�rre end 10000 du skal betale licens ";	
	}
}
