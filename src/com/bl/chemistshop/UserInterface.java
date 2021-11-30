package com.bl.chemistshop;

import java.util.List;

public class UserInterface {
	
	public void printAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).type == Medicine.Type.HOMEOPATHY) {
			System.out.println(list.get(i));
		}
	  }		
	}
	
	public void printAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).type == Medicine.Type.ALLOPATHY) {
			System.out.println(list.get(i));
		}
	  }		
	}
	
	public void printAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).type == Medicine.Type.AYURVEDIC) {
			System.out.println(list.get(i));
		}
	  }		
	}
	
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

