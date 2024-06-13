package edu.svit.sf04.java.statickeyword;

public class MyclassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myclass objone = new Myclass();
		System.out.println(objone);
		
		Myclass.show();
		
		Myclass objtwo = new Myclass();
		System.out.println(objtwo);
		
		System.out.println("static  member: "+Myclass.srno);

	}

}
