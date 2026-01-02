package Java;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=in.nextInt();
		int reverse=0;
		int remainder;
		int temp=n;
		while(temp>0) {
			remainder=temp%10;
			reverse=(reverse*10)+remainder;
			temp=temp/10;
			}
		if(n==reverse) {
			System.out.println(n+" is a Palindrome");
		}
		else {
			System.out.println(n+" is Not a Palindrome");
		}
	}
}
