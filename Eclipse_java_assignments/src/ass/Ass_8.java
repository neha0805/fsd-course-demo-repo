package ass;

import java.util.Scanner;

public class Ass_8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int no1,no2,no3,sum,avg;
		
		System.out.print("Enter 1st no: ");
		no1=sc.nextInt();
		
		System.out.print("Enter 2nd no: ");
		no2=sc.nextInt();
		
		System.out.print("Enter 3rd no: ");
		no3=sc.nextInt();
		System.out.println();
		
		sum=no1+no2+no3;
		System.out.println("Sum is: "+sum+"\n");
		
		avg=sum/3;
		System.out.println("Average is: "+avg);
	}

}
/*
Output:
Enter 1st no: 2
Enter 2nd no: 4
Enter 3rd no: 6

Sum is: 12

Average is: 4
*/
