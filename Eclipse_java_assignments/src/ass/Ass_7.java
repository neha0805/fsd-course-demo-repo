package ass;

import java.util.Scanner;

public class Ass_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		
		System.out.print("Enter 1st no: ");
		no1=sc.nextInt();
		
		System.out.print("Enter 2nd no: ");
		no2=sc.nextInt();
		
		System.out.print("Enter 3rd no: ");
		no3=sc.nextInt();
		
		if(no1>no2)
		{
			if(no1>no3)
				System.out.println("Largest number is: "+no1);
			else
				System.out.println("Largest number is: "+no3);
		}
		else
		{
			if(no2>no3)
				System.out.println("Largest number is: "+no2);
			else
				System.out.println("Largest number is: "+no3);
		}

	}

}
/*
 Output:
Enter 1st no: 10
Enter 2nd no: 30
Enter 3rd no: 20
Largest number is: 30
*/

