package mainclass1;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import doctor.Doctor;
import mainclass1.Mainclass1;

public class Doctors 
{
	static Doctor c1= new Doctor();
static Scanner sc= new Scanner(System.in);
	
	// Valid name method to throw the exception
		public static boolean validname(String s) {
			boolean res = true;
			try {
				Integer n = Integer.parseInt(s);
			} catch (Exception E) {
				res = false;
			}
			return res;
		}

		// Check name method and it will throw the exception
		static public void checkName() {
			System.out.println("Enter Doctor name");
			String s = sc.next();
			if (validname(s)) {
				try {
					throw new NumberFormatException();
				} catch (NumberFormatException e) {
					System.out.println();
					System.out.println("Enter the correct name");
					checkName();
				}
			}
			c1.setdName(s);
		}

		// Check charge method and it will also throw the exception
		static public void checkAge() {
			System.out.println("Enter the appointment charge:");
			try {
				String age = sc.next();
				int age1 = Integer.parseInt(age);
				c1.setdCharge(age);
			} catch (NumberFormatException e1) {
				System.out.println("Invalid");
				//System.out.println("Enter your age in numbers.!!!");
				checkAge();
			}
		}

		// Check mobile method and it will also throw the exception
		static public void checkMobile() {
			System.out.println("Enter  mobile number:");
			String ph = sc.next();
			if (Taco3.validnumber(ph)) {
				c1.setdPhone(ph);
			} else {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Invalid number");
					System.out.println("Enter a valid number");
					checkMobile();
				}
			}
		}

		
		// Given the option to choose the department
		
		static void deptoption()
		{
			System.out.println("Enter the department:");
			System.out.println("Select the available department:");
			System.out.println("\n1.Ent\n2.Skin\n3.Neurology\n4.Eye");
			try
			{
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				String dept="Ent";
				System.out.println(dept);
				c1.setdDept(dept);
				break;
			}
			case 2:
			{
				String dept="Skin";
				System.out.println(dept);
				c1.setdDept(dept);
				break;
			}
			case 3:
			{
				String dept="Neurology";
				System.out.println(dept);
				c1.setdDept(dept);
				break;
			}
			case 4:
			{
				String dept="Eye";
				System.out.println(dept);
				c1.setdDept(dept);
				break;
			}
			default:
			{
				System.out.println("Please Enter the correct option");
				deptoption();
				break;
			}
			}
			
			}
			catch(Exception e)
			{
				System.out.println("Invalid choice");
				System.out.println("Please enter a correct input, enter only numbers.");
				e.printStackTrace();
			}
			
		}
		
		// check email method and it will throw the exception
		static public void checkEmail() {
			System.out.println("Enter Email id");
			String s0 = sc.next();
			String s2 = s0.toLowerCase();
			if (Taco2.validemail(s2)) {
				c1.setdEmail(s2);
				//System.out.println("Congratulations !!");
				// System.out.println("Your appointment got booked for 15 mins at"+ t + "With
				// Doctor Mo");
			} else {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Invlid Email !!!");
					System.out.println("Enter a valid email");
					checkEmail();
				}
			}
		}
		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("---->Welcome Admin<----");
		do
		{
		System.out.println("Please select the option");
		System.out.println("\n1.Add a new Doctor"+ /*\n2.Update the details\n3*/ "\n2.Remove the doctor\n3.Go back to Main Menu");
		try
		{
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			String dID=IDGen.randomString(5);
			c1.setdID(dID);
			checkName();
			checkAge();
			checkMobile();
			checkEmail();
			
			// dept
			deptoption();
			
			System.out.println("Enter the appointment duration");
			int duration=sc.nextInt();
			c1.setdDuration(duration);
			System.out.println("Enter the start time");
			String start=sc.next();
			c1.setdStart(start);
			System.out.println("Enter the endtime");
			String end=sc.next();
			c1.setdEnd(end);
			storage.Stroage.mapofDoctors.put(c1.getdName(), c1);
			
			mainclass1.Doctor.printTimeSlots(LocalTime.parse(start), LocalTime.parse(end), duration,c1.getdName());
			DoctorD.File(dID, c1.getdName(), c1.getdCharge(), c1.getdDept(), c1.getdDuration(), c1.getdEmail(), c1.getdPhone(), c1.getdStart(), c1.getdEnd());
			 //File(String dID, String dName, String dCharge, String dDept, String dDuration, String dEMail, String dPhone, String dStart, String dEnd)
			//System.out.println();
			
			DoctorDept.doctorDept(c1.getdDept(),c1.getdName());
			System.out.println("*****************************");
			System.out.println("New doctor is added");
			System.out.println("*****************************");
			break;
			
		}
		case 2:
		{
			System.out.println("Enter the doctor name:");
			String name=sc.next();
			System.out.println("Under process");
			
			break;
		}
		/*case 3:
		{
			break;
		}*/
		case 3:
		{
			mainclass1.Mainclass1.main(args);
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
		while(1>0);
		
		
		
	}

}
