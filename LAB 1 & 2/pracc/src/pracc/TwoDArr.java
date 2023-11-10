package pracc;
import java.util.Scanner;
public class TwoDArr {
public static void main(String[] args) {
	int[][] arr1=new int[3][3];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr1[0].length;j++)	
	{
		System.out.println("Enter number: ");
		arr1 [i][j] = sc.nextInt();
		
	}
	}
	
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+"\t1");
		}
		System.out.println();
		
	}
	
}}