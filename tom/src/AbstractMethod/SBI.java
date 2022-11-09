package AbstractMethod;

public class SBI extends Bank {
	@Override
	int SARateofinterst() {
		// TODO Auto-generated method stub

		return 7;
	}

	@Override
	public void CARateofinterst() {
		System.out.println(" SBI Current Account interst rate: 11 %");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s = new SBI();
		int i = s.SARateofinterst();
		System.out.println(" SBI Saving Account interst rate:" + i + "%");
		s.CARateofinterst();
	}
}