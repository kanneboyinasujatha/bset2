import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	
		int n=5;
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		System.out.println("the factorial of 5 is"+result);
	}
}
