package ass;

import java.util.Scanner;

public class Ass_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int a,b;
        
        System.out.print("Enter first no: ");
        a=sc.nextInt();
        
        System.out.print("Enter second no: ");
        b=sc.nextInt();
        
        System.out.println("\nBefore swapping: "+"\na:"+a+"\nb:"+b+"\n");
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("After swapping: "+"\na:"+a+"\nb:"+b);

	}

}
/*
 Output:
Enter first no: 2
Enter second no: 5

Before swapping: 
a:2
b:5

After swapping: 
a:5
b:2
*/
