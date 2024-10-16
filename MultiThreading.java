package alby;
import java.util.*;
class EvenNum implements Runnable
{
public int a;
public EvenNum(int a)
{
	this .a=a;
}
	public void run() {
		System.out.println("the thread " +a+"iseven and the square is:"  +a*a);
			
	}
	
}
class OddNum implements Runnable{
	int a;
	public OddNum(int a) {
		this.a=a;
	}

	
	public void run() {
		System.out.println("the thread "  +a+"isodd and the square root is:"  +a*a*a);
		
	}
	
}
class RandomNumGenerator extends Thread{
	public void run() {
		int n=0;
		Random rand=new Random();
		try {
			for (int i=0;i<10;i++)
			{
				n=rand.nextInt(20);
				System.out.println("generated number is"+n);
				if(n%2==0) {
					Thread thread1=new Thread(new EvenNum(n));
					thread1.start();
					
				}
				else {
					Thread thread2=new Thread(new OddNum(n));
					thread2.start();
							
				}
		Thread.sleep(1000);
		System.out.println("***********************");
				
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
public class MultiThreadRandOddEven {
	public static void main(String args[]) {
		RandomNumGenerator Randnum=new RandomNumGenerator ();
		Randnum.start();
	}

}
