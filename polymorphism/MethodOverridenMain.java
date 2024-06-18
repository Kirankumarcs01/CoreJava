package edu.sivt.sf04java.polymorphism;

public class MethodOverridenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rbi bankone = new Sbi();
		System.out.println(bankone.getRateOfinterest());

		Rbi banktwo = new Hdfc();
		System.out.println(banktwo.getRateOfinterest());
	}

}
