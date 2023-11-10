package Person;
import java.util.Scanner;
public class StudentService {
	static Student[] pArr;
	static int cnt;
	static {
		pArr = new Student[10];
		pArr[0]=new Student("Harry Potter","58615",45,64,85);
		pArr[1]=new Student("Shinchan","56486",85,65,25);
		pArr[2]=new Student("Capt. Jack Sp","524648",85,65,23);
		cnt=3;
	}
	
	
	
	
	public static void addNewStudent() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter mobile : ");
		String mobile=sc.nextLine();
		
		System.out.println("Enter M1 : ");
		int m1=sc.nextInt();
		
		System.out.println("Enter M2 : ");
		int m2=sc.nextInt();
		
		System.out.println("Enter M3 : ");
		int m3=sc.nextInt();
		
		pArr[cnt]=new Student(name,mobile,m1,m2,m3);
		cnt++;
	}

	
	/**
	 * 
	 */
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(pArr[i]);
		}
	
	}	
	
	public static Student searchById(int id) {
			for(Student s : pArr) {
				if(s!=null) {
					if(s.getId()==id) {
						return s;
					}
					
			}
				else {
					return null;
				
				}
			}
			return null;

		
	}
	
	
	public static Student[] searchByName( String n) {
		Student[] sarr=new Student[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(pArr[i].getName().equals(n)) {
				sarr[count]=pArr[i];
				count++;
			}
		}
		if (count>0) {
			return sarr;
		}
		return null;
	}
	
	
}
