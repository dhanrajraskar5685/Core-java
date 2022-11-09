package Interface;

public class Custmore implements Bank1, Bank2 {

	@Override
	public void CARateofinterst() {
		// TODO Auto-generated method stub
		System.out.println("current accout interst rate 7%");
	}

	@Override
	public int SARateofinterst() {
		// TODO Auto-generated method stub

		return 8;

	}

	public static void main(String[] args) {

		Custmore c = new Custmore();
		// int i = c.SARateofinterst();
		System.out.println("Saving account interst rate :" + c.SARateofinterst() + "%");
		c.CARateofinterst();

	}
}
