package javaprogram;
import java.io.FileReader;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//try with resources
		try(FileReader fr=new FileReader("D://MYSQL.txt")) {
        int i;
        	while((i=fr.read())!=-1){
        		System.out.print((char)i);   
        	}}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}