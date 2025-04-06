package part3;

class Student{
	int regNo;
	String name;
	int mark;
}
public class ArrayOfObjects {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.regNo =1;
		s1.name ="Thilak";
		s1.mark =98;
		Student s2 = new Student();
		s2.regNo =2;
		s2.name ="Karthik";
		s2.mark = 87;
		Student s3 =  new Student();
		s3.regNo = 3;
		s3.name ="Maya";
		s3.mark = 78;
		
		Student studs[] =  new  Student[3];
		studs[0] =s1;
		studs[1] =s2;
		studs[2] =s3;
		
		for(int i=0;i<studs.length;i++) {
			System.out.println(studs[i].name +" : "+studs[i].mark);
		}
		
				
				
	}
}
