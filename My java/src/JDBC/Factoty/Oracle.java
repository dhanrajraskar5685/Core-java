package JDBC.Factoty;

public class Oracle extends Database {
	public Oracle() {
		setDriveName("com. oracle.cj.jdbc.Driver");
		setUserName("oracle%%123");
	}

}
