package inheritance;

public class citizen {
	private long adharNo;
	private long voterId;
	private String nationality;
	/**
	 * @param adharNo
	 * @param voterId
	 * @param nationality
	 */
	public citizen(long adharNo, long voterId, String nationality) {
		this.adharNo = adharNo;
		this.voterId = voterId;
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "citizen [adharNo=" + adharNo + ", voterId=" + voterId + ", nationality=" + nationality + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public long getVoterId() {
		return voterId;
	}
	public void setVoterId(long voterId) {
		this.voterId = voterId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

}
