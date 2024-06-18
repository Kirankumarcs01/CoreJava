package edu.sivt.sf04java.polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("addition of two number\n" +Methodoverloading.addition(10,10));
			System.out.println("addition of two number\n"+Methodoverloading.addition(20f,10f));
			System.out.println("addition of two number\n"+Methodoverloading.addition(11f,10));
			System.out.println("addition of two number\n"+Methodoverloading.addition(11,10f));
		   System.out.println("addition of two number\n"+Methodoverloading.addition("helloworld",":java"));
	}

}
