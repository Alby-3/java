package javalab;
import java.util.*;
class EvenNum implements Runnable {
	
	 public int a;
	 public EvenNum(int a){
		this .a=a; 
	 }

	public void run() { 
		System.out.println("the thread "+a+" is even and its square is "+a*a);	
	}
    }
 class OddNum implements Runnable{
	 public int a;
	 public OddNum(int a) {
		 this.a=a;
	 }
	public void run() {
		System.out.println("the thread  "+a+" is odd and the cube is "+a*a*a);	
	}
 }
class RandomNumGenerator extends Thread{
	public void run() {
		int n=0;
		Random rand=new Random();

			for( int i=0;i<10;i++) {
    n=rand.nextInt(20);
    System.out.println("the generated number is "+n);
    if(n%2==0) {
    	Thread thread1 =new Thread( new EvenNum(n));
    	thread1.start();
    }else
    {
    	Thread thread2=new Thread( new OddNum(n));
    	thread2.start();
    }
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    System.out.println("*******************");
			}		
		
		
		}	
	}
public class MultiThreadRandomOddEven {
public static void main (String args[]) {
	RandomNumGenerator rand_num=new RandomNumGenerator ();
	rand_num.start();
	
}
}

