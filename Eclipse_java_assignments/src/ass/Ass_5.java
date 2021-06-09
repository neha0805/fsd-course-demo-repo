package ass;

import java.util.Scanner;

public class Ass_5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         char ch;
         int num;
         System.out.print("Enter:");
         ch=sc.next().charAt(0);
         num=ch-'0';
         if(Character.isDigit(ch))
        	 System.out.print("Integer value is: "+num);
         else
        	 System.out.println("Entered value is not an integer");
	}

}
/*
Output:
Enter:5
Integer value is: 5

Enter:a
Entered value is not an integer

*/