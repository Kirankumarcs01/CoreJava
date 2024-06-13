package inheritance;

public class Student  extends citizen{
	private int studentId;
	private String name;
	private String deparment;
	private String proctor;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", deparment=" + deparment + ", proctor="
				+ proctor + ", toString()=" + super.toString() + ", getAdharNo()=" + getAdharNo() + ", getVoterId()="
				+ getVoterId() + ", getNationality()=" + getNationality() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	/**
	 * @param adharNo
	 * @param voterId
	 * @param nationality
	 * @param studentId
	 * @param name
	 * @param deparment
	 * @param proctor
	 */
	public Student(long adharNo, long voterId, String nationality, int studentId, String name, String deparment,
			String proctor) {
		super(adharNo, voterId, nationality);
		this.studentId = studentId;
		this.name = name;
		this.deparment = deparment;
		this.proctor = proctor;
	}
	
	}
	


