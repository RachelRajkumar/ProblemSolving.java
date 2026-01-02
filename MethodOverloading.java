package Java;
import java.util.*;

public class MethodOverloading {
	void add(int a,int b) {
		System.out.println("Sum of 2 Numbers:"+(a+b));
		}
	void sub(int a,int b) {
		System.out.println("Subtraction of 2 Numbers:"+(a+b));
		}
	void mul(int a,int b,int c) {
		System.out.println("Multiplication of 3 Numbers:"+(a*b*c));
		}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MethodOverloading MO=new MethodOverloading();
		System.out.print("Enter the First Number:");
		int x=in.nextInt();
		System.out.print("Enter the Second Number:");
		int y=in.nextInt();
		System.out.print("Enter the Third Number:");
		int z=in.nextInt();
		MO.add(x,y);
		MO.sub(x, y);
		MO.mul(x,y,z);
		}

}
