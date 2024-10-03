package javalab;
import java.util.Scanner;
class AgeException extends Throwable{
	public AgeException(String message) {
		super(message);
	}
}

public class Custom {

	public static void ValidateAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Age must be atleast 18 years");
		}
	
		System.out.println("Age is valid "+age);
	}


	public static void main(String[] args)
	{
	System.out.println("Eligibility test for voting");
	System.out.println("Enter your age ");
	Scanner sc=new Scanner(System.in);
	int age =sc.nextInt();
	try
	{
		ValidateAge(age);
	}
	catch(AgeException e)
	{
		System.out.println("Error occured  "+e.getMessage());
	}
	finally
	{
		System.out.println("i am finally back");
	}
sc.close();

	}

}
