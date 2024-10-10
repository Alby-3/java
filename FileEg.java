package javalab;
import java.io.*;
class FileEg 
{

	public static void main(String[] args)
	{
try {
	FileInputStream fin=new FileInputStream("Filename1.txt");
	FileOutputStream fout=new FileOutputStream("FileName2.txt");
	int i;
	while((i=fin.read())!=-1)
	{
		fout.write(i);
	}
	System.out.println("successfully wrote to the specific file");
	fin.close();fout.close();
}
catch(FileNotFoundException e)
{
	System.out.println(e.getMessage());
}
catch(IOException e)
{
	System.out.println(e.getMessage());
}
	}

}

