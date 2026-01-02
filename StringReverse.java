package Java;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a String:");
		String n=in.nextLine();
		char a[]=n.toCharArray();
		String reverse=" ";
		for(int i=a.length-1;i>=0;i--) {
			reverse=reverse+a[i];
			}
		System.out.print("Reversed String:"+reverse);
		 }
}
