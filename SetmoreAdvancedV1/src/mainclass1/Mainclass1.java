package mainclass1;

import java.util.InputMismatchException;
import java.util.Scanner;

import doctor.Doctor;
import doctor.DoctorManipulation;


public class Mainclass1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Design.main(args);
		//System.out.println("Please select");
		//System.out.println("\n1. Admin \n2. User \n3. Reports");
		try
		{
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			Doctors.main(args);
			break;
		}
		case 2:
		{
			UserMain.main(args);
			break;
		}
		case 3:
		{
			SearchID.main(args);
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
			System.out.println("********************************");
			System.out.println("Incorrect choice");
			System.out.println("Please enter only numbers");
			System.out.println("********************************");
			main(args);
		}
	}

}
