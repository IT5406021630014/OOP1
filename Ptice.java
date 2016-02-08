import java.io.*;
import java.util.Scanner;

public class Ptice 
{
	public static void main(String[] args) 
	{
		int answerN=0;
		String answer="";
		int AScore=0;
		int BScore=0;
		int GScore=0;
		int MScore=0;
		boolean flag = true;
		String AdrainPattern = "ABCABCABCABC";
		String BrunoPattern = "BABCBABCBABC";
		String GoranPattern = "CCAABBCCAABB";
		
		Scanner scan = new Scanner(System.in);
		while(flag)
		{
			System.out.print("Enter number of answer(0-100) : ");
			answerN = scan.nextInt();
			if((answerN > 0)&&(answerN <= 100))
			{
				flag = false;
			}
		}
		answer = scan.next();
		AScore = CheckAns(AdrainPattern,answer);
		BScore = CheckAns(BrunoPattern,answer);
		GScore = CheckAns(GoranPattern,answer);
		MScore = MaxScore(AScore,BScore,GScore);
		System.out.println(MScore);
		if(MScore == AScore)
		{
			System.out.println("Adrain");
		}
		if(MScore == BScore)
		{
			System.out.println("Bruno");
		}
		if(MScore == GScore)
		{
			System.out.println("Goran");
		}
		
	}

	public static int CheckAns(String patternPerson,String patternAns)
	{
		int score = 0;
		int indexOfPattern = 0;
		for(int i = 0;i<patternAns.length();i++)
		{
			if(patternAns.charAt(i) == patternPerson.charAt(indexOfPattern))
			{
				score++;
			}
			if(indexOfPattern < patternPerson.length())
			{
				indexOfPattern++;
			}
			else
			{
				indexOfPattern = 0;
			}
		}
	return score;
	}

	public static int MaxScore(int A,int B,int G)
	{
		return Math.max(A,Math.max(B,G));	
	}
}
