class MyLicenseException extends Exception{
	private static final long serialVersionUID = 1L;
	private int taeller;
	private int naevner;
	
	public MyLicenseException(int taeller,int naevner){
		super("Tæller = "+ taeller + "  Nævner = " + naevner + " Resultatet er større end 10000 du skal betale licens ");
		this.taeller =taeller;	
		this.naevner =naevner;
		
	}
	// Override the "toString" method
	   public String toString(){  
		   return "Tæller = "+ taeller + "  Nævner = " + naevner + " Resultatet er større end 10000 du skal betale licens ";	
	}
}
