package pracc;
import java.util.Scanner;
public class arr {

	public static void AcceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("ENter number: ");
			arr[i]=sc.nextInt();
			
		}
	}
	
public static void DisplayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

public static int SumArr(int[] arr){
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Sum or array is");
	return sum;
}
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		AcceptData(arr);
		DisplayData(arr);
		int a=SumArr(arr);
		System.out.println("Sum of Array is:"+a);
	}
	
}
