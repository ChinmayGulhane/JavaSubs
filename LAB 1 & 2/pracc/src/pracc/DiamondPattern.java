package pracc;

public class DiamondPattern {
public static void main(String[] args) {
	int number=5;
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
	
	
//	public static void main(String[] args) {
//		int num=3;
//		
//				for(int i=1;i<=num;i++) {
//						for(int j=1;j<=2*i-1;j++) {
//							System.out.print("*");
//						}
//				System.out.println();
//				}
//				
//				
//				
//				for(int i=num;i>=1;i--) {
//						for(int j=2*i-1;j>=1;j--) {
//							System.out.print("*");
//						}
//					System.out.println();
//					}
//		
//		
//		
//	}
}
