package edu.svit.sf04.java.statickeyword;

public class Myclass {
	private int section;
	static int srno;
	
	//static block
	static {
		System.out.println("within staic block...");
		srno=1000;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + ",srno="+srno+"]";
	}
	Myclass()
	{
		System.out.println("within default costructor");
		srno++;
	}
	public static void show()
	{
		System.out.println(srno);
        
	}

}
