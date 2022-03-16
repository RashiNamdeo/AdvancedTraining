package com.namdeo.training;

public class medicine {
	public void displayLabel() {
		System.out.println("Company : Globex Pharma");
		System.out.println("Address : Bangalore");
	}
}

class Tablet extends medicine {

	public void displayLabel() {
		System.out.println("store in a cool dry place");
	}
}

class Syrup extends medicine {
	public void displayLabel() {
		System.out.println("Consumption as directed by thephysician");
	}
}

class Ointment extends medicine {
	public void displayLabel() {
		System.out.println("for external use only");
	}
}