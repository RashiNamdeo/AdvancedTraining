package com.namdeo.training;

import java.util.ArrayList;

class Student_Array_List {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
		
	
	if(list.indexOf(2)>=0)
		System.out.println("2 Dhoni exists in the ArrayList");
		
	else
		System.out.println("2 Dhoni does not exist in the ArrayList");
		
	if(list.indexOf(8)>=0)
		System.out.println("8 Virat exists in the ArrayList");
		
	else
		System.out.println("8 Virat not exist in the ArrayList");
		
	}
}
