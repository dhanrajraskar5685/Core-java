package WideningAndNorrowingcasting;

public class NarrowingCasting {

	double d = 66.1;
	float f = (float) d;
	long l = (long) d;
	int i = (int) d;
	short s = (short) d;
	byte b = (byte) d;
	char c = (char) d;

	public static void main(String[] args) {

		NarrowingCasting nc = new NarrowingCasting();
		System.out.println(" Before conersion double value:" + nc.d);
		System.out.println(" After conersion float value:" + nc.f);
		System.out.println(" After conersion long value:" + nc.l);
		System.out.println(" After conersion int value: " + nc.i);
		System.out.println(" After conversion byte value:" + nc.b);
		System.out.println(" After conersion short value: " + nc.s);
		System.out.println(" After conersion char value: " + nc.c);
	}

}
