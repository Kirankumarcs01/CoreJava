package edu.svit.sf04.Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x[] = new int[] {1,919,12,2,4};
			System.out.println("The elament at last index:"+x[1]);
			System.out.println("The elment at the 5th index: "+x[5]);
			
			
		}catch(Exception e) {
			
			System.out.println("Index is out of bound for length 5:");
			
			
		}
		System.out.println("hello world");
		System.out.println("This will not execute");
		
		//try,catch,finally,throw,throws
		try {
		int z=0;
		int d=42/z;
		System.out.println("The value in d:"+d);
	}catch(ArithmeticException a){
		
		System.out.println("Arithematic exception occured:"+a.getMessage());
	}finally {
	
		System.out.println("inside finalyy block....");
	}
 }
}

