package javalab;
import java.util.*;
import java.io.*;

public class FileExp2 {
	
		public static void main (String args[]) {
			
			try {
				Scanner sc=new Scanner(System.in);
				File obj1=new File("Register1.txt");
				obj1.createNewFile();
				System.out.println("Register1.txt created successfully\n");
				
				FileWriter fout =new FileWriter ("Register1.txt");
				System.out.println("enter your keam rank");
				int mark=sc.nextInt();
				fout.write(mark+"\n");
				fout.close();
				System.out.println("your data has been added");
				FileReader fin=new FileReader("Register1.txt");
				BufferedReader br=new BufferedReader(fin);
				String Line;
				System.out.println("\n content of Register1.txt is ");
				while((Line=br.readLine())!=null) {
					System.out.println(Line);
				}
				br.close();
			}
			catch(IOException e) {
				System.out.println("Exception occured:"+e.getMessage());
			}
		}
	}


