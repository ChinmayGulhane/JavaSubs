  package pracc;
import java.util.Scanner;
public class oneDArr {
	public static void AcceptData(int[] arr) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Number: "+(i+1));
			arr[i]=sc.nextInt();
		} 

	}
	public static void DisplayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+" : "+arr[i]);
		}
	}
	
	public static int SumArr(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr= new int[5];
		AcceptData(arr);
		DisplayData(arr);
		System.out.println(SumArr(arr));
	}
	
}
