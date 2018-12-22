package mainclass1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientReport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select \n 1. Indivisual Report \n 2. All Reports");
		try
		{
		int n= sc.nextInt();
		switch(n)
		{
		case 1:
		{
			PatientSearch.main(args);
			break;
		}
		case 2:
		{
			Read.ReadFile("Patient");
			break;
		}	
		default:
		{
			System.out.println("Invalid option");
			System.out.println("Please select the correct option");
			System.out.println("********************************");
			main(args);
		}
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Incorrect choice");
			System.out.println("Please select the correct option");
			System.out.println("********************************");
			main(args);
		}
		
	}

}
