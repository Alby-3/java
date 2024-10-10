package javalab;
//import java.io.File;
import java.io.*;
public class  {

	public static void main(String[] args) {
		try {
			File obj=new File("Filename1.txt"); 
			if(obj.createNewFile()) 
			{
				System.out.println("file created:"+obj.getName());
			}else {
				System.out.println("file already exists");
			}
		}catch(IOException e){
			System.out.println("an error occured");
			e.printStackTrace();
		}

	}

}
