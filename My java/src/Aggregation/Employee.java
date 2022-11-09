package Aggregation;

public class Employee {
	private int eid;
	private String ename;
	private String esalary;
	private Dept d;// entity refrance

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public Dept getDept() {
		return d;
	}

	public void setDept(Dept d1) {
		this.d = d1;
	}
}
