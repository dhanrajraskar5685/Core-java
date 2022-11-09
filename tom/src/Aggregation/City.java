package Aggregation;

public class City {
	int MH;
	String cityname;
	String famousplace;
	State s;

	public int getMH() {
		return MH;
	}

	public void setMH(int mH) {
		MH = mH;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getFamousplace() {
		return famousplace;
	}

	public void setFamousplace(String famousplace) {
		this.famousplace = famousplace;
	}

	public State getS() {
		return s;
	}

	public void setS(State s) {
		this.s = s;
	}

}
