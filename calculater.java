import java.util.*;
import java.io.*;
class Calculater
{
public static void main(String[] args) throws IOException
	{
		System.out.println("enter 1 to continue or any other to exit");
		ch =sc.nextInt();
	do{	
		
	double ans;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a =sc.nextInt();
	System.out.println("Enter 2nd number");
	int b =sc.nextInt();
	System.out.println("Enter your choice");
	System.out.println("Enter 1 for add");
	System.out.println("Enter 2 for substruct");
	System.out.println("Enter 3 for multiply");
	System.out.println("Enter 4 for devide");
	int c =sc.nextInt();
	switch(c)
		{
		case 1:
		      ans=a+b;
		      System.out.println("Ans is "+ans);
		      break;
		case 2:
		      ans=a-b;
		      System.out.println("Ans is "+ans);
		      break;
		case 3:
		      ans=a*b;
		      System.out.println("Ans is "+ans);
		      break;
		case 4:
		     ans=a/b;
		     System.out.println("Ans is "+ans);
		     break;
		     
		default:
		System.out.println("Your choice is wrong");	
		}
		System.out.println("enter 1 to continue or any other to exit");
		ch =sc.nextInt();
	}
	while(ch==1);
	}
}