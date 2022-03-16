package com.namdeo.training;

import java.util.Vector;
public class TestEmployeeCollection {
	public static void main(String[] args) {
		Vector<Employee> v = addInput();
		display(v);
		}

	private static Vector<Employee> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<Employee> v) {
		// TODO Auto-generated method stub
		
	}

	public static Vector<Employee> main1(String[] args) {
		Employee e1=new Employee (101,"bhavani", "Mallethula");
		Employee e2=new Employee (102,"srlekha", "kakani");
		Employee e3=new Employee (103,"akanksha", "pasikanti");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void main11(String[] args) {
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}