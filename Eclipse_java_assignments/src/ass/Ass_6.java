package ass;

import java.util.Scanner;

public class Ass_6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		boolean isAlpha;
		
		System.out.print("Enter any alphabet: ");
		ch=sc.next().charAt(0);
		
		isAlpha=Character.isAlphabetic(ch);
		
		if(isAlpha)
			switch(ch)
			{
			case 'a','e','i','o','u','A','E','I','O','U':System.out.println(ch+" is a vowel.");
			break;
			
			default:System.out.println(ch+" is a consonant.");
			}
		else
			System.out.println(ch+" is not a alphabet.");
	}

}

/*
Output:
Enter any alphabet: a
a is a vowel.

Enter any alphabet: I
I is a vowel.

Enter any alphabet: [
[ is not a alphabet.

Enter any alphabet: 4
4 is not a alphabet.

*/