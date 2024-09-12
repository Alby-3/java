package javalab;
import java.util.Scanner;

public class MatrixMultiplication {


	public static void main(String[]args) {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the order of matrix 1");
		  int m1=sc.nextInt();
		int n1=sc.nextInt(); 
		 System.out.println("enter the order of matrix");
		 int m2=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1!=m2) {
			System.out.println("matric multiplication is not possible");
		}else {
			int A[][]=new int[m1][n1];
			int B[][]=new int[m2][n2];
			int C[][]=new int[m1][n2];
			System.out.println("matrix multplication is possible");
			System.out.println("enter the elements of matix 1");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
			A[i][j]=sc.nextInt();	
				
			}
		}
		System.out.println("enter the elements of matix 2");
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
			B[i][j]=sc.nextInt();	
			}}
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
			C[i][j]=0;
			for(int k=0;k<n1;k++) {
				C[i][j]=C[i][j]+A[i][k]*B[k][j];
			}
			}}
		System.out.println("matrix A");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(A[i][j]+"\t");
				
			}System.out.println();
		}
		System.out.println("matrix B");
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(B[i][j]+"\t");
				
			}System.out.println();
		}
		System.out.println("matrix C");
		for( int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(C[i][j]+"\t");
				
			}System.out.println();
		}
		
		
		
		}
		
		
	}

	

	}


