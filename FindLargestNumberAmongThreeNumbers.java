package Java;
import java.util.*;

public class FindLargestNumberAmongThreeNumbers {
         public static void main(String []args) {
        	 Scanner in=new Scanner(System.in);
        	 int X,Y,Z;
        	 System.out.print("Enter the First Number:");
        	 X=in.nextInt();
        	 System.out.print("Enter the Second Number:");
        	 Y=in.nextInt();
        	 System.out.print("Enter the Third Number:");
        	 Z=in.nextInt();
        	 if(X>Y && X>Z) {
        		 System.out.println("X is a Largest Number");
        	 }
        	 else if(Y>Z && Y>X) {
        		 System.out.println("Y is a Largest Number");
        	 }
        	 else {
        		 System.out.println("Z is a Largest Number");
        	 }
        	 
         }
}
