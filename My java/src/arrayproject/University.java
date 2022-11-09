package arrayproject;

public class University {

//	public Student s = new Student();
//	public Student s2 = new Student();
//	public Student s3 = new Student();

		public static void main(String[] args) 
		{
			
	College college = new College();

	Student[] studentarray= college.addstudentdetails();
	for( Student s :studentarray  ) {
		System.out.println( s.sid+" "+s.name+" " +s.address);
	}
		

	

	}

}
