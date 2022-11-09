package Exception2;

import java.io.IOException;
import java.net.SocketException;

public class Child extends Parent {
	// if parent default constructor throw check exception you have to compulsory
	// write to child throw same expection or parent
	public Child() throws Exception {

	}

	@Override // in child class not required throws exception
	// but you want write then you throw same as parent or child exception
	public void m1() throws SocketException {
		// TODO Auto-generated method stub
		System.out.println("Override Method");

	}

	@Override // if you written throw in child class you have compulsory to throw in parent
				// class same or parent of exception
	public void m2() throws IOException {
		// TODO Auto-generated method stub
		super.m2();
	}

	@Override // uncheck exception not required to throw in parent class
	public void m3() throws ArithmeticException {
		// TODO Auto-generated method stub
		super.m3();
	}

}
