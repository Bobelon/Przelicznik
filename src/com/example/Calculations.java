package com.example;

public class Calculations {
	
	public String dmsToDm(String degrees, String minutes, String seconds) {
		
		int D, M, S;
		
		try {
			D = Integer.parseInt(degrees);
			M = Integer.parseInt(minutes);
			S = Integer.parseInt(seconds);
		}
		catch(NumberFormatException e) {
			return "Niew³aœciwy format danych";
		}
		return "DM = " + D + " " + M + " " + S;
	}
	
	public String dmToDms(String degrees, String minutes) {		
		int D, M;
		
		try {
			D = Integer.parseInt(degrees);
			M = Integer.parseInt(minutes);
		}
		catch(NumberFormatException e) {
			return "Niew³aœciwy format danych";
		}
		return "DMS = " + D + " " + M;
	}
}
