package com.bl.chemistshop;

public class Crocin extends Medicine {
	Crocin() {
		companyName = "AZH";
		type = Medicine.Type.ALLOPATHY;
		composition = new String[4];
		composition[0] = "Caffeine";
		composition[1] = "Ibuprofen";
		composition[2] = "analgesic";
		composition[3] = "antipyretic";
	}

}
