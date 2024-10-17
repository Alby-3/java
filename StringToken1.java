package javalab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringToken1 {
	public static void main(String[] args) {
   int n ,sum=0; 
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the integer with 1 space gap");
 String s=sc.nextLine();
 StringTokenizer st=new StringTokenizer(s);
  while(st.hasMoreTokens()) {
	String a=st.nextToken();
	n=Integer.parseInt(a);
	System.out.println(n);
	sum+=n;
}
System.out.println("sum  of  integer ="+sum);
sc.close();
	}
	}
	
	
