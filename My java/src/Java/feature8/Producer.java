package Java.feature8;

import java.util.function.Supplier;

public class Producer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Supplier<Double> v =()->Math.random();
 
 
 System.out.println(v.get());
	}

}
