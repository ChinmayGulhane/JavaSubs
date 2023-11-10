package pracc;
import java.util.*;
public class AllFunctions {
	public static void MulTable(int m) {
		int prod=1;
		for(int i=1;i<=10;i++) {
			prod=m*i;
			System.out.println(prod);
		}
		
	}
	
	public static void DaimondPattern(int number) {
//		int i,j;
//		for(i=1;i<=number/2 +1;i++) {
//			for(j=1; j<(number/2)-i;j++) {
//				System.out.print(" ");
//			}
//			for(j=1; j<=i*2 -1;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			
//		}
//		for(i=(number/2);i>0;i--) {
//			for(j=1; j<(number/2)-i;j++) {
//				System.out.print(" ");
//			}
//			for(j=1; j<=i*2 -1;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			
//		}
		int i,j;
		for(i=1;i<=number;i++) {
			for(j=1; j<number-i;j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i*2 -1;j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		for(i=number-1;i>0;i--) {
			for(j=1; j<number-i;j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i*2 -1;j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	}
	
	

}
