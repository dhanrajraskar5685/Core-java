package JDBC.Factoty;

public class Database {
	String driveName, userName;

	public String getDriveName() {
		return driveName;
	}

	public void setDriveName(String driveName) {
		this.driveName = driveName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void showconnectionDeatils() {

		System.out.println("Drive name:-" + getDriveName());
		System.out.println("User name:-" + getUserName());
	}

}
