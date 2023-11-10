package Person;
import java.util.Scanner;
public class TestStudentArr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice;
	do {
		System.out.println("1. Add new choice \n 2. Display all \n 3. Display by id \n 4. Update Mobile \n 5. Display by name \n 6. Exit \n Choice: ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			StudentService.addNewStudent();
			break;
			
		case 2:
			StudentService.displayAll();
			break;
		case 3:
			System.out.println("enter id");
			int id=sc.nextInt();
			Student S = StudentService.searchById(id);
			System.out.println(S);
			break;
		case 4 :
			
		case 5:
			System.out.println("enter name");
			sc.nextLine();
			String name=sc.nextLine();
			Student[] S1 =StudentService.searchByName(name);
			if (S1!=null) {
				for(Student S2:S1) {
					System.out.println(S2);
				}
			}
			else {
				System.out.println("Not Found");
			}
			break;
		case 6:	
			System.out.println("Thank you Wrong again");
			break;

		default :
			System.out.println("Thank you");
		}
		}while(choice != 6);

}
}
