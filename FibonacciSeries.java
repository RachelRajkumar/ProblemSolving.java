package Java;
import java.util.*;

public class FibonacciSeries {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Range:");
		int n=in.nextInt();
		int NextTerm=0;
		int a=0,b=1;
		System.out.print(a+","+b+",");
		for(int i=2;i<n;i++) {
		NextTerm=a+b;
		a=b;
		b=NextTerm;
		System.out.print(NextTerm+",");
		}
		}
}
