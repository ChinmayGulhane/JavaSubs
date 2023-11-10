package Person;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student("Tom","15544",85,67,41);
		s1.displayStudent();
		//System.out.println(s1);
		//s1.setid(4);
		Student s2=new Student("Jerry","58413",55,65,55);
		s2.displayStudent();
		
		Student s3=new Student(null,"52868",56,85,95);
		s3.displayStudent();
	}	

	
}
