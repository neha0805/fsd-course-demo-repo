package ass;

import java.util.Scanner;
public class Ass_1
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         char ch;
         int asc;
         System.out.print("Enter a charachter:");
         ch=sc.next().charAt(0);
         asc=ch;
         System.out.print("Ascii value of "+ch+" is: "+asc);
    }
}

/*
Output:
Enter a charachter:a
Ascii value of a is: 97

Enter a charachter:A
Ascii value of A is: 65
*/