import java.util.Scanner;
import java.io.*;

public class  Trik
{
	//boolean glass1 = true,glass2 = false,glass3 = false;
	public static void main(String[] args) 
	{
		String pattern = "";
		char[] patternChar;
		boolean flagOver = true;
		boolean glass1 = true,glass2 = false,glass3 = false;
		Scanner scan = new Scanner(System.in);
		
		while(flagOver)
		{
			System.out.print("Enter pattern : ");
			pattern = scan.next();
			if(pattern.length()>50)
			{
				System.out.println("Your pattern are over 50 char.\nPlease try again.");
			}
			else
			{	
				if(CheckABC(pattern))
				{
					flagOver = false;
				}
				else 
				{
					System.out.println("Your pattern must Only have A B C \nPlease try again.");
				}
			}
		}

		for(int i = 0;i < pattern.length();i++)
		{
			if(pattern.charAt(i) == 'A')
			{
				boolean temp;
				temp = glass1;
				glass1 = glass2;
				glass2 = temp;
				//SwapGlass(glass1,glass2);

			}
			else if(pattern.charAt(i) == 'B')
			{
				boolean temp;
				temp = glass2;
				glass2 = glass3;
				glass3 = temp;
				//SwapGlass(glass2,glass3);
			}
			else if(pattern.charAt(i) == 'C')
			{
				boolean temp;
				temp = glass1;
				glass1 = glass3;
				glass3 = temp;
				//SwapGlass(glass1,glass3);
			}
		}
		if(glass1)
		{
			System.out.println("Ball in glass 1");
		}
		else if(glass2)
		{
			System.out.println("Ball in glass 2");
		}
		else if(glass3)
		{
			System.out.println("Ball in glass 3");
		}

	}

	public static boolean CheckABC(String str)
	{
		for(int i = 0;i < str.length();i++)
		{
			if(str.charAt(i) != 'A')
			{
				 if(str.charAt(i) != 'B')
				 {
					if(str.charAt(i) != 'C')
					{
						return false;
					}
				}
			}
		
		}
		return true;
	}

   /*public static void SwapGlass(boolean glass1,boolean glass2)
	{
		boolean temp;
		temp = glass1;
		glass1 = glass2;
		glass2 = temp;
	}*/
}
