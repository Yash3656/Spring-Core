package com.springcores;

public class Country {

	     String countryName;
	    Capital capital;
	    public String getCountryName() {
	        return countryName;
	    }
	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }
	    public Capital getCapital() {
	        return capital;
	    }
	    public void setCapital(Capital capital) {
	        this.capital = capital;
	    }
}

// BY Constructor
/*
public class Country {
    String countryName;
   Capital capital;

   public Country(String countryName, Capital capital) {
	 super();
	 this.countryName = countryName;
	 this.capital = capital;
	}
	   
	public String getCountryName() {
	       return countryName;
	   }
	   
	public Capital getCapital() {
	 return capital;
}

}

*/