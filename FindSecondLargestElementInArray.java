package Java;
import java.util.*;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.print("Enter Array Elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.print("Sorted Array:");
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The Second Largest Element is:"+a[n-2]);
		}
}
