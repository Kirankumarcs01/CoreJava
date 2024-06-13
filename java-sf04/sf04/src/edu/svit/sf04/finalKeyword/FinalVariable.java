package edu.svit.sf04.finalKeyword;

public  class FinalVariable {
	
	final int x=100;//final variable has to be initialized
	
	static final int y=20;
	
	FinalVariable()
	{
		//x=120;cannot reinitialized final key
		//y=21; cannot reinitialized final and static field
			
	}
	final static int z=180;
	
	static {
		//z=190;
		//y=234;
		
	}
	public static void show()
	{
		System.out.println("The value of z:"+z);
		
	}

}
