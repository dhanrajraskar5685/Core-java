
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllDetails ad = new AllDetails();
		Student s=ad.getStudentinfo();
		University u= ad.getallStudentinfo();
	State t =ad.getalluniversityinfo();
		
		System.out.println("................................");
		System.out.println(s.sid+" "+s.name+" "+s.address);
		System.out.println("......................................");
		System.out.println(u.s1.sid+" "+ u.s1.name+" "+u.s1.address);
		System.out.println(u.s2.sid+" "+ u.s2.name+" "+u.s2.address);
		System.out.println(u.s3.sid+" "+u.s3.name+" "+u.s3.address);

		System.out.println("......................................");
		System.out.println(t.u1.s1.sid+" "+ t.u1.s1.name+" "+ t.u1.s1.address);
		System.out.println(t.u1.s2.sid+" "+ t.u1.s2.name+" "+t.u1.s2.address);
		System.out.println(t.u1.s3.sid+" "+t.u1.s3.name+" "+t.u1.s3.address);

		System.out.println(t.u2.s1.sid+" "+ t.u2.s1.name+" "+ t.u2.s1.address);
		System.out.println(t.u2.s2.sid+" "+ t.u2.s2.name+" "+ t.u2.s2.address);
		System.out.println(t.u2.s3.sid+" "+t.u2.s3.name+" "+t.u2.s3.address);

		System.out.println(t.u3.s1.sid+" "+ t.u3.s1.name+" "+ t.u3.s1.address);
		System.out.println(t.u3.s2.sid+" "+ t.u3.s2.name+" "+t.u3.s2.address);
		System.out.println(t.u3.s3.sid+" "+t.u3.s3.name+" "+t.u3.s3.address);	
	}
}
