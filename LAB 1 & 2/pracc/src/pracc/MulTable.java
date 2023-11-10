package pracc;
import java.util.Scanner;
public class MulTable {

	public static void MulT(int m) {
		int prod=1;
		for(int i=1;i<=10;i++) {
			prod=m*i;
			System.out.println(prod);
		
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number to print table: ");
		Scanner cat=new Scanner(System.in);
		int mango =cat.nextInt();
		MulT(mango);
		
	}
	
}
