package Interface;

public class MySQL implements Myconnection {
	
	@Override
	public void commit() {
		System.out.println("My SQL commit method");
		
	}
@Override
public void rollback() {
	// TODO Auto-generated method stub
	System.out.println("MySQL Roll method");
	}
public static void main(String[] args) {
	MySQL my = new MySQL();
	my.commit();
	my.rollback();
	Myconnection c = new MySQL();
	c.commit();
	c.rollback();
}
}