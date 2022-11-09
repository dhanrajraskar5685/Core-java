package GetterSetterMethod;

public class A {

	public int id;
	public String name;
	public boolean status;
	public long accountnumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

}