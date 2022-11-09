package AbstractMethod;

public class PNB extends Bank {
	@Override
	int SARateofinterst() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public void CARateofinterst() {
		System.out.println(" PNB Current Account interst rate: 12%");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PNB p = new PNB();
//		int i = p.SARateofinterst();
//		System.out.println(" PNB Saving account interst rate:" +i+"%");
//		p.CARateofinterst();
		Bank b;
		b = new SBI();
		System.out.println(" SBI Saving Account interst rate:" + b.SARateofinterst() + "%");
		b.CARateofinterst();
		b = new PNB();
		System.out.println(" PNB Saving account interst rate:" + b.SARateofinterst() + "%");
		b.CARateofinterst();
	}

}
