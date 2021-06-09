package ass;

import java.util.Scanner;

public class Ass_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double r,area,circumference;
		
		System.out.print("Enter radius: ");
		r=sc.nextDouble();
		
		circumference=2*3.14*r;
		System.out.println("\nCircumference of the circle is: "+circumference);
		
		area=3.14*r*r;
		System.out.println("\nArea of the circle is: "+area);
	}

}
/*
Output:
Enter radius: 7

Circumference of the circle is: 43.96

Area of the circle is: 153.86
*/