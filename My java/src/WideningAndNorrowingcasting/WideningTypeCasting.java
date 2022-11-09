package WideningAndNorrowingcasting;

public class WideningTypeCasting {

	byte b = 90;
	short s = b;
	int i = b;
	long l = b;
	float f = b;
	double d = b;
	char c =(char)b;

	@Override
	public String toString() {
		return "WideningTypeCasting [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", c="
				+ c + "]";
	}

	public static void main(String[] args) {
		
		WideningTypeCasting wt = new WideningTypeCasting();
		/*
		 * System.out.println(" Before conversion byte value:" + wt.b);
		 * System.out.println(" After conersion short value: " + wt.s);
		 * System.out.println(" After conersion int value: " + wt.i);
		 * System.out.println(" After conersion long value:" + wt.l);
		 * System.out.println(" After conersion float value:" + wt.f);
		 * System.out.println(" After conersion double value:" + wt.d);
		 * System.out.println(" After conersion char value: " + wt.c);
		 */
		System.out.println(wt);

	}

}
