package GetterSetterMethod;

public class B {

	public static void main(String[] args) {
		A a = new A();
		a.setId(10000);
		a.setAccountnumber(985063832);
		a.setStatus(false);
		a.setName("Raskar");

		System.out.println(a.getId());
		System.out.println(a.getAccountnumber());
		System.out.println(a.getName());
		System.out.println(a.getStatus());

	}

}