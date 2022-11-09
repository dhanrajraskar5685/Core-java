package Aggregation;

public class College1 {
	int cid;
	String collegeName;
	String collegeAddress;
	University u;// refer entity
	Address adr;

	public College1(int cid, String collegeName, String collegeAddress, University u, Address adr) {
		super();
		this.cid = cid;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.u = u;
		this.adr = adr;
		
		
	}

	@Override
	public String toString() {
		return "College1 [cid=" + cid + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress + ", u="
				+ u + ", adr=" + adr + "]";
	}

}
