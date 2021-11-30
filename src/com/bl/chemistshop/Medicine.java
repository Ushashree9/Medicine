package com.bl.chemistshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type {
		HOMEOPATHY, ALLOPATHY, AYURVEDIC
	}
	
	String companyName;
	Type type;
	Date mfgDate;
	Date expDate;
	String[] composition;
	
	@Override
	public String toString() {
		return "Medicine [brand=" + companyName + ", type=" + type + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", composition="
				+ Arrays.toString(composition) + "]";
	}
}
