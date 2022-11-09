package String;

public class Substring {

	public static void main(String[] args) {
//We pass beginIndex and endIndex number position in the Java substring method
// where beginIndex is inclusive, and endIndex is exclusive. 
//In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
		
		
		
		
		
		
		String string = "YASHRAJVASUDEORASKAR";
		String s = string.substring(0, 7);
		// D0 H1 A2 N3 R4 A5 J6
		System.out.println(s);
		String s1 = string.substring(7, 14);
		// V7 A8 S9 U10 D11 E12 O13
		System.out.println(s1);
		// R14 A15 S16 K 17 A 18 R19
		String s3 = string.substring(14, 20);

		System.out.println(s3);

		// TODO Auto-generated method stub

	}

}
