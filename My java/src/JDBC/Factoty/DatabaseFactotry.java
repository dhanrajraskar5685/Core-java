package JDBC.Factoty;

public class DatabaseFactotry {

	public DatabaseFactotry() throws IllegalAccessException {
		throw new IllegalAccessException("cant created");

	}

	public static Database creatDatabaseObject(DataBaseType type) {

		switch (type) {
		case MYSQL:
			return new MySql();

		case ORACLE:
			return new Oracle();
		case Mongodb:
			return new Mongodb();

		default:

			break;
		}

		return null;

	}

}