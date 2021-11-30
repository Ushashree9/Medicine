package com.bl.chemistshop;

import java.util.Date;
import java.util.List;
public class Application {
	
	public static void main(String[] args) {
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("30/11/2021");
		crocin.expDate = new Date("30/12/2021");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("30/11/2021");
		gluconD.expDate = new Date("30/12/2021");
		
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("30/11/2021");
		pantopD.expDate = new Date("30/12/2021");
		
		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date("30/11/2021");
		aciloc.expDate = new Date("30/12/2021");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("30/11/2021");
		disprin.expDate = new Date("30/12/2021");
		
		Natrumur natrumur = new Natrumur();
		natrumur.mfgDate = new Date("30/11/2021");
		natrumur.expDate = new Date("30/12/2021");
		
		MedicineStore medicineStore = new MedicineStore();
		
		medicineStore.add(crocin);
		medicineStore.add(gluconD);
		medicineStore.add(pantopD);
		medicineStore.add(aciloc);
		medicineStore.add(disprin);
		medicineStore.add(natrumur);
		
		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(crocin);
		medicineStore.remove(gluconD);
		
		System.out.println("Printing after removal: ");
		userInterface.print(medicineList);
		userInterface.printAllHomeopathy(medicineList);
	}

}