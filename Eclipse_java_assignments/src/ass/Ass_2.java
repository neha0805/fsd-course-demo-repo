package ass;

import java.util.Scanner;

public class Ass_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int dividend,divisor,quotient,remainder;
        
        System.out.print("Enter dividend: ");
        dividend=sc.nextInt();
        
        System.out.print("Enter divisor:");
        divisor=sc.nextInt();
        
        quotient=dividend/divisor;
        remainder=dividend%divisor;
        
        System.out.println("For "+dividend+" divided by "+divisor+":\nQuotient: "+quotient+"\nRemainder: "+remainder);
	}

}
/*
 * Output:
Enter dividend: 75
Enter divisor:10
For 75 divided by 10:
Quotient: 7
Remainder: 5
 */