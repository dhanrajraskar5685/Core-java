package Interface;

public class OracleDatabase implements Myconnection {

	@Override
	public void commit() {
		System.out.println("***oracle commit***");

	}

	@Override
	public void rollback() {
		System.out.println("***oracle rollback***");

	}

	public static void main(String[] args) {
		Myconnection connection = new OracleDatabase();
		connection.commit();
		connection.rollback();
		System.out.println("*********************************************");
		OracleDatabase o = new OracleDatabase();
		o.commit();
		o.rollback();

	}
}
