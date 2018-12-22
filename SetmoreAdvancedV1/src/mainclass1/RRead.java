package mainclass1;

import java.io.File;
import java.util.Scanner;

public class RRead {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the doctor name");
		String name=sc.next();
		String file=name.concat(".txt");
		File f1=new File(file);
		System.out.println("Enter the slot");
		String s1=sc.next();
		SearchID s= new SearchID();
		s.displayDetails(f1, s1);
	}

}
