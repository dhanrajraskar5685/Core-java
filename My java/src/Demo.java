
public class Demo   
{
	/**Global variable  */
	
public byte b= 127;                   // -128 to 127 (size 8 bit)
public byte b1;
public short s= 140;                 // -32768 to 32767 (size 16 bit)
public short s1;
public int i= 333;                  // -2147483648 to 2147483647 size ( size 32 bit )
public long l = 9850698325L;          // write any value ( size 64)
public float f = 10.121111111111111111111111111111111111111111111111111f;          // floating point in decimal and int
public double d = 12.15111111111111111111111111111111111;         // double of floating point in decimal and int
 public char c = 'B';
 public boolean o ;
 
 /** non primitive data type */
 public String name = "test";
 public String add = "pune";
 
 /** local Variable */
 
 public void addalldatatype() {
	 byte b= 117;
	  short s= 150;
	  int i= 6666;
	  long l = 15915165; 
	  float f = 20.12f; 
 double d = 12.1515;
	   char c = 'c';
	   String name = " dhanraj";
	   
	   
	   System.out.println("local variable result ");
	   System.out.println(b);
	   System.out.println(s);
	   System.out.println(i);
	   System.out.println(l);
	   System.out.println(f);
	   System.out.println(d);
	   System.out.println(c);
	   System.out.println(name);
	   System.out.println("by default value");
	   System.out.println(b1);
}
 
public static void main(String[] args) {
		Demo d = new Demo();    // object creation
		System.out.println(" Globale varibal result");
System.out.println(d.b);
System.out.println(d.s);
System.out.println(d.i);
System.out.println(d.l);
System.out.println(d.f);
System.out.println(d.d);
System.out.println(d.c);
System.out.println(d.name);
System.out.println(d.add);
System.out.println(d.o);
System.out.println(d.s1);
System.out.println(d.b1);

d.addalldatatype();      // calling method for local variable 


	}

}
