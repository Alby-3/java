package javalab;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
	
	
			char ch='a';
		
		System.out.println("choose the operation");
		System.out.println("1 for arithmetic operation");
		System.out.println("2 for array operation");
		Scanner sc=new Scanner(System.in);
		int choice= sc.nextInt();
		switch(choice) {
			case 1:{
				try {
				System.out.println("Enter  the numerator");
            int numerator=sc.nextInt();
            System.out.println("Enter the  denominator");
            int denominator=sc.nextInt();
            int result=numerator/denominator;
            System.out.print("result= "+result);
				}catch(ArithmeticException e){
					System.out.print("Arithmetic exception "+e);
					System.out.println(e.getMessage());
				}
	}
			break;
		case 2:{
			try {
				int[] number= {1,2,3};
				System.out.println("enter the index of the array");
				int index =sc.nextInt();
				System.out.println("number "+number[index] );
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.print("Array index out of bound"+e);
				System.out.println(e.getMessage());
			}}
		break;
				default : {
					System.out.println("Choose a valid option ");
					 
				}
			
				}}
		}
		
