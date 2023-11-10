package pracc;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int numb=scc.nextInt();
		int fac= fact(numb);
		System.out.println("factorial is: "+fac);
		
	}
	
	public static int fact(int num) {
		int prod=1;
		for(int i=1;i<=num;i++) {
			prod=prod*i;
			
		}
		return prod;
	}
	
}
