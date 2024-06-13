package inheritance;

public class Employee extends citizen {
	private String employeeName;
	private int salary;
	private String department;
	private int employeeId;
	/**
	 * @param employeeName
	 * @param salary
	 * @param department
	 * @param employeeId
	 */
	/**
	 * @param employeeName
	 * @param salary
	 * @param department
	 * @param employeeId
	 */
	/**
	 * @param adharNo
	 * @param voterId
	 * @param nationality
	 * @param employeeName
	 * @param salary
	 * @param department
	 * @param employeeId
	 */
	public Employee(long adharNo, long voterId, String nationality, String employeeName, int salary, String department,
			int employeeId) {
		super(adharNo, voterId, nationality);
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", department=" + department
				+ ", employeeId=" + employeeId + ", toString=" + super.toString() + ", getAdharNo=" + getAdharNo()
				+ ", getVoterId=" + getVoterId() + ", getNationality=" + getNationality() +"]";
	}
	
	
	
	
	

}
