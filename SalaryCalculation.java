package Java;
import java.util.*;

public class SalaryCalculation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Employee ID:");
		int a=in.nextInt();
		in.nextLine();
		System.out.print("Enter Employee Name:");
		String b=in.nextLine();
		System.out.print("Enter Employee Basic Salary:");
		double c=in.nextDouble();
		 double HRA=c*20/100;
		 double DA=c*10/100;
		 double TotalSalary=c+HRA+DA;
		 System.out.println("Employee Details:");
		 System.out.println("Employee ID:"+a);
		 System.out.println("Employee Name:"+b);
		 System.out.println("Employee Basic Salary:"+c);
		 System.out.println("HRA:"+HRA);
		 System.out.println("DA:"+DA);
		 System.out.println("TotalSalary:"+TotalSalary);
	}

}
