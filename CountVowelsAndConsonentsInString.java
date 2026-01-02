package Java;
import java.util.*;

public class CountVowelsAndConsonentsInString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a String:");
		String n=in.nextLine();
	    n=n.toLowerCase();
	    int Vowels=0;
	    int Consonents=0;
	    for(int i=0;i<n.length();i++) {
	    	char a=n.charAt(i); 
	    	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
	    		Vowels++;
	    	}
	    	else {
	    		Consonents++;
	    	}
	    }
	    System.out.println("Vowels are:"+Vowels++);
	    System.out.println("Consonents are:"+Consonents++);
		}
}
		

	


