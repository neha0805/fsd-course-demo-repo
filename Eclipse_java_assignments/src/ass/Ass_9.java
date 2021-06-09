package ass;

import java.util.Scanner;

public class Ass_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int p,r,t,simple_interest;
		
		System.out.print("Enter principal amt: ");
		p=sc.nextInt();
		
		System.out.print("Enter rate of interest: ");
		r=sc.nextInt();
		
		System.out.print("Enter time (in years): ");
		t=sc.nextInt();
		
		simple_interest=p*r*t/100;
		
		System.out.println("Simple interest is: "+simple_interest);

	}

}
/*
Output:
Enter principal amt: 100
Enter rate of interest: 5
Enter time (in years): 5
Simple interest is: 25
*/
