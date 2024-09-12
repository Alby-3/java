package javalab;
import java.util.Scanner;
 interface Human{
	 final int jobid=1050;
	 void learn(String str);
	 void work();
	 
 }
 interface Recruitment{
	 void screening(int score);
 }
class Programmer implements Human,Recruitment{
	public void learn(String str)
	{
		System.out.println("my training area:"+str);
	}
	public void screening(int score)
	{
		System.out.println("Test score is "+score);
	}
	public void work() {
		System.out.println("selected to the Role department ");
	}
}

public class Interface {

	public static void main(String[] args) {
		
   Programmer trainee= new Programmer();
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter your trained area");
  String str=sc.nextLine();
  System.out.println("Test score is");
  int score=sc.nextInt();
  System.out.println("ABOUT MY PLACEMENT");
  trainee.learn(str);
  trainee.screening(score);
  trainee.work();
  	System.out.println("my job id is "+trainee.jobid);
  }

}
