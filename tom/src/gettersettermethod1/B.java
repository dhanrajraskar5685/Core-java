package gettersettermethod1;

public class B {

	public static void main(String[] args) {
		A a = new A();
		a.setId(100);
		a.setName("Dj");
		a.setAccountbalance(155555.6666666666666);
        a.setMobno(985069832);
		a.setStatus (true);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getAccountbalance());
		System.out.println(a.getStatus());
		System.out.println(a.getMobno());
		}
}