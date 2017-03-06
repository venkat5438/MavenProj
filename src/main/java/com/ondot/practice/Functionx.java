package com.ondot.practice;

public class Functionx {
	
	public static String name;
	
	
	public Functionx(String name){
		this.name=name;
	}

	public static void main(String[] args) {// Static function
		// TODO Auto-generated method stub
		/*add();
		add(45,65);
		double addition=add(25,35.5);
		add();*/
		Functionx obj = new Functionx("Suresh");
		obj.add1();
	}
	
	public static void add(){// Static function
		int a=10; // local variables
		int b=20;
		
		int addition = a+b;
		System.out.println(addition);
	}
	
	public static void add(int a, int b){// Static function
		int addition = a+b;
		System.out.println(addition);
	}
	
	public static double add(double a, double b){ // Static function
		double addition = a+b;
		System.out.println(addition);
		return addition;
	}
	
	public void add1(){ // Non static function
		
	System.out.println("Selenium student:"+name);
		
	}


}
