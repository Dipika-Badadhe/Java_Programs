package JAVA_A;
import java.io.*;
import java.util.*;

public class file__reader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader filereader = new FileReader("F://filereader.txt");
		Scanner sc = new Scanner(filereader);
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		sc.close();
	}

}