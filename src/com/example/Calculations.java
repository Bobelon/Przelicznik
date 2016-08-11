package com.example;

public class Calculations {
	
	public String dmsToDm(String degrees, String minutes, String seconds) {
		
		float D, M, S;
		
		try {
			D = Float.parseFloat(degrees);
			M = Float.parseFloat(minutes);
			S = Float.parseFloat(seconds);
		}
		catch(NumberFormatException e) {
			return "Niew³aœciwy format danych";
		}
		
		M += S / 60;
		
		return "DM = " + D + "* " + M + "'";
	}
	
	public String dmToDms(String degrees, String minutes) {		
		float D, M, S;
		
		try {
			D = Float.parseFloat(degrees);
			M = Float.parseFloat(minutes);
		}
		catch(NumberFormatException e) {
			return "Niew³aœciwy format danych";
		}
		
		S = 0;
		return "DMS = " + D + "* " + M + "' " + S + "\"";
	}
}
