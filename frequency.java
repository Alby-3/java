package javalab;
import java.util.Scanner;
public class frequency {
	
 public static void main(String[]args){
 int i,len=0,count=0;
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the string");
 String str =sc.nextLine();
 System.out.println("enter the character");
 char ch=sc.nextLine().charAt(0);
 len=str.length();
 for(i=0;i<len;i++) {
	 if(str.charAt(i)==(ch)){
		 count++;
	 }
 }
 System.out.println("count of occurance "+ch+"="+count);
		 
	 
 }}