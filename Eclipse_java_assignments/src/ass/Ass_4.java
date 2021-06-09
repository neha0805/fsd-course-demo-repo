package ass;

import java.util.Scanner;

public class Ass_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        char input;
        
        System.out.print("Enter any character:");
        input=sc.next().charAt(0);
        
        if((input>=65 && input<='Z') || (input>=97 && input<='z'))
        	System.out.println(input+" is an alphabet.");
        else
        	System.out.println(input+" is not an alphabet.");
        
	}

}

/*
Output:
Enter any character:[
[ is not an alphabet.

Enter any character:A
A is an alphabet.

Enter any character:z
z is an alphabet.

Enter any character:@
@ is not an alphabet.

*/