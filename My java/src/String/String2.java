package String;

public class String2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s = "   hi guys good morning ";
		System.out.println(s);
		s = s.trim();// remove first and last spaces only
		System.out.println(s);
		s = s.toUpperCase();// in capital letter
		System.out.println(s);
		s = s.toLowerCase();// small letter
		System.out.println(s);
		String[] str = s.split(" ");
		for (String s1 : str)

		{
			System.out.println(s1);
		}

		String[] strchar = s.split("good");
		for (String string : strchar) {
			System.out.println(string);
			String s5 = "Dhanraj Vasudeo Raskar ";
			int i = s5.indexOf("V");
			System.out.println(i);
			System.out.println("*********************");
			String name="ABCDEFGHIJKL";
		String k	=name.substring(4);
					System.out.println(k);
			String s2=  new String("DHANRAJ").intern();
			
		}

	}

}
