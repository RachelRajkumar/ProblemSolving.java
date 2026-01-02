package Java;
import java.util.*;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
	     System.out.print("Enter Array Size:");
	     int n=in.nextInt();
	     int a[]=new int[n];
	     System.out.print("Enter Array Elements:");
	     for(int i=0;i<n;i++) {
	    	 a[i]=in.nextInt();
	    	  }
	     System.out.print("The Remaining Elements are:");
	     for(int i=0;i<n;i++) {
	    	 int Count=0;
	    	 for(int j=0;j<i;j++){
	    		 if(a[i]==a[j]) {
	    			 Count++;
	    		 }
	    		 }
	    	 if(Count==0) {
	    		 System.out.print(a[i]+" ");
	    	 }
	     }
        	 }
	}

