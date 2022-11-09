package getterandsetterfileexample;

public class Test {
	public static void main(String[] args) {
		Employee e = new Employee();

		//e.setEid(102);
		//e.setEname("Amol");
		//e.setAddress("pune");
		e.setMobno(865823281);
		e.setAccountbalance(1562.36);
		e.setStatus(true);

		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getAddress());
		System.out.println(e.getMobno());
		System.out.println(e.getAccountbalance());
		System.out.println(e.getStatus());

		
	}


	}


