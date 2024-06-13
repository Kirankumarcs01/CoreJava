package edu.svit.sf04.java.statickeyword;

public class Employee {
	private int id;
    private	String Name;
    
    //static variable or class variable
	private String company="IBM";

	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ",company="+company;
	}
	
	

}
