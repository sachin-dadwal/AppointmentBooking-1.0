package mainclass1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import doctor.Doctor;

import patient.Patient;


public class UserMain
{
	static Scanner sc= new Scanner(System.in);
	static Doctor c1= new Doctor();
	static Patient d1= new Patient();
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
			System.out.println("Enter your name");
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
			d1.setpName(s);
		}

		// Check age method and it will also throw the exception
		static public void checkAge() {
			System.out.println("Enter your age:");
			try {
				String age = sc.next();
				int age1 = Integer.parseInt(age);
				d1.setpAge(age);
			} catch (NumberFormatException e1) {
				System.out.println("Invalid");
				System.out.println("Enter your age in numbers.!!!");
				checkAge();
			}
		}

		// Check mobile method and it will also throw the exception
		static public void checkMobile() {
			System.out.println("Enter your mobile number:");
			String ph = sc.next();
			if (Taco3.validnumber(ph)) {
				d1.setpMobilenumber(ph);
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

		// check email method and it will throw the exception
		static public void checkEmail() {
			System.out.println("Enter your Email id");
			String s0 = sc.next();
			String s2 = s0.toLowerCase();
			if (Taco2.validemail(s2)) {
				d1.setpEmail(s2);
				System.out.println("Congratulations !!");
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
		
		
		
		// method given to user enter the details and validate them
		static void useroption(String slottime, String dName,String dDept) {
			checkName();
			checkAge();
			checkMobile();
			checkEmail();
			 String pName=null;
			// File creation to store the patient details
			File f2 = new File("Patient.txt");
			boolean empty = f2.length() == 0;
			String patientID = IDGen.randomString(5);
			// Checking if file is empty if it is empty then store the content in the
			// file.and if file is not empty then goto the else part
			pName=d1.getpName();
		//	System.out.println("Patient Name:"+pName);
			if (empty) {
				try {
					f2.setWritable(true);// setting the content of the file to true to allow to write.
					FileWriter fw = new FileWriter(f2);
					FileOutputStream fo = new FileOutputStream(f2);
					// fw.write(map);
					fw.write("Patient details Table\n\r");
					fw.write("\n\r");
					fw.write("\n\r");
					fw.write("Patient id" + "\t" + "Patient Name" + "\t" + "Patient Age" + "\t" + "Patient Email" + "\t"
							+ "Patient Contact Number");
					fw.write("\n\r");
					fw.write("\n\r");
					fw.write(patientID + "\t\t" + d1.getpName() + "\t\t" + d1.getpAge() + "\t\t" + d1.getpEmail() + "\t"
							+ d1.getpMobilenumber());
					// fw.write(c1.getcAge());
					fw.write("\n\r");
					// fw.write("\n\r");
					fw.flush();
					fw.close();
					// System.out.println("Content written sucessfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// This part will check if the file is not empty then continue to save the data
			// in the file .
			else {

				FileWriter fw;
				try {
					// Constructs a FileWriter object given a File object.
					// If the second argument is true, then bytes will be written to the endof the
					// file rather than the beginning.
					fw = new FileWriter("Patient.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					// bw.write("This is just to check how it is working");
					bw.newLine();
					fw.write("\n\r");
					bw.write(patientID + "\t\t" + d1.getpName() + "\t\t" + d1.getpAge() + "\t\t" + d1.getpEmail() + "\t\t\t"
							+ d1.getpMobilenumber());
					fw.write("\n\r");
					// fw.write("\n\r");
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			
			// Here creating the date object
			Date date = new Date();
			// System.out.println( date);
			// Formating the date into "yyyy/MM/dd" format
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

			// Passing the Date object into the DateFormat and storing into String
			String d1 = dateFormat.format(date);
			
			// String s=d.toString();
			// System.out.println(d1);
	//		System.out.println("Patient Name:"+pName);
			// This method is will return the next day date if you enter the any date.
			// System.out.println(Test1.getNextDate(d1));

			// Generating the appointment ID and storing it in a variable.
			
			String appointmentID = IDGen.randomString(5);
//			System.out.println("Congratulations !!!!");
			System.out.println(pName+"(ID "+patientID+")"+",your appointment got booked for 15 mins at " + slottime + " with Doctor "+ dName
					+ " on " + Test1.getNextDate(d1) + " at " + date + " with Appointment ID " + appointmentID + " .");

			// Now creating a file to store the appointment information
			File f3 = new File("Appointment.txt");

			// File file = new File(path);
			// boolean empty = !file.exists() || file.length() == 0;

			// Again checking the if the file is empty if yes then writing the content in
			// the file and otherwise go to else part.
			boolean empty1 = f3.length() == 0;

			if (empty1) {
				try {
					f3.setWritable(true);
					FileWriter fw = new FileWriter(f3);
					FileOutputStream fo = new FileOutputStream(f3);

					fw.write("Appointment details Table\n\r");
					fw.write("\n\r");
					fw.write("\n\r");
					fw.write("Appointment ID:" + "\t" + "Doctor Name:" + "\t" /*"Appointment charge:"*/ + "\t" + "Department:"
							+ "\t" /*+ "Appointment duration"*/ + "\t" + "Appointment date:" + "\t" + "Patient ID:");
					fw.write("\n\r");
					fw.write("\n\r");
					fw.write(appointmentID + "\t\t" + dName + "\t\t"  + "\t\t\t"
							+ dDept /*"\t\t" + Doctors.duration + " minutes."*/ + "\t\t" + Test1.getNextDate(d1)
							+ "\t\t" + patientID);
					fw.write("\n\r");
					// fw.write("\n\r");
					// fw.write(c1.getcAge());
					fw.flush();
					fw.close();
					// System.out.println("Content written sucessfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {

				FileWriter fw;
				try {
					// if the file is not empty then start writing in the file at the end rather
					// then at begin.
					fw = new FileWriter("Appointment.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					// bw.write("This is just to check how it is working");
					bw.newLine();
					bw.write("\n\r");
					bw.write(appointmentID + "\t\t" + dName + "\t\t" /*+ "$" + Doctors.price1 */+ "\t\t\t"
							+ dDept /*+ "\t\t" + Doctors.duration + " minutes."*/ + "\t\t" + Test1.getNextDate(d1)
							+ "\t\t" + patientID);
					bw.write("\n\r");
					// fw.write("\n\r");
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////
		static String re=null;
		public static String displayDetails(File f,String s)
		{
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String string=s;
			boolean res=false;
			String line=br.readLine();
			while(line!=null)
			{
				if(line.indexOf(string)!=-1)
				{
					res=true;
					re=line;
					//System.out.println(line);
					line =null ;
					
				}
				line=br.readLine();
			}
			if(res==false)
			{
				 System.out.println("No details found, key does not exists !!");
			}	
		} catch (IOException e) {//FileNotFoundException | IOException e
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re;
		}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static void main(String[] args) {
		
		
		do
		{
			
	//Ent\n2.Skin\n3.Neurology\n4.Eye
	System.out.println("\nPlease Select the available Doctors  \n\n1. Ent Specialist \r\n" + "2. Skin Specialist \r\n"+ "3. Neurology Specialist \r\n"+ "4. Eye Specialist\r\n"+"5. Go back to Main Menu");
		try {
			int choice = sc.nextInt();
			String slot=null;
			switch (choice) {
			case 1: {
				String s="Ent".concat(".txt");
				File f1=new File(s);
				System.out.println("Available doctors");
				System.out.println("=====================================");
				System.out.println("Doctor Name"+"\t"+"Department\n");
				
				Read.displayDetails(f1, "Ent");
				
				System.out.println("=====================================");
				/*//System.out.println(display);
				
				//String[] sp=display.split("\t\t");
				//System.out.println(sp);
				System.out.println("***************************************");
				for(int i=0;i<sp.length;i++)
				{
					System.out.println(sp[i]);
				}
				System.out.println("=====================================");*/
				
				System.out.println("\nselect the doctor:");
				try
				{
				String doctor=sc.next();
				Read.ReadM(doctor);
				//String ss=displayDetails(f1, doctor);
				
				System.out.println("\nSelect the available slots:");
				slot=sc.next();
				String doctorname=doctor.concat(".txt");
				File f=new File(doctorname);
				FileOperation.deleteLine(slot,f);
				System.out.println("slot size"+slot);
				useroption(slot, doctor, "Ent");
				// Think of login to get the doctor id and store that in the appointment file.
				
				/*Doctor d=storage.Stroage.mapofDoctors.get(doctor);
				System.out.println(storage.Stroage.mapofDoctors.get(doctor));
			
				System.out.println("Dcotor is"+d.getdID());
				System.out.println("Doctor name"+d.getdName());*/
				
				
				
				//Read.ReadFile(doctor);
				}
				catch(Exception e)
				{
					System.out.println("Enter the correct option");
					e.printStackTrace();
				}
				
				break;
			}
			case 2: {
				String s="Skin".concat(".txt");
				File f1=new File(s);
				System.out.println("Available doctors");
				System.out.println("=====================================");
				System.out.println("Doctor Name"+"\t"+"Department\n");
				Read.displayDetails(f1, "Skin");
				System.out.println("=====================================");
				System.out.println("\nselect the doctor:");
				try
				{
				String doctor=sc.next();
				Read.ReadM(doctor);
				System.out.println("\nSelect the available slots:");
				slot=sc.next();
				String doctorname=doctor.concat(".txt");
				File f=new File(doctorname);
				FileOperation.deleteLine(slot,f);
				useroption(slot, doctor, "Skin");
			/*	Doctor d=storage.Stroage.mapofDoctors.get(doctor);
				String doctorID=d.getdID();
				System.out.println(doctorID);*/
				}
				catch(Exception e)
				{
					System.out.println("Enter the correct option");
				}
				

				
				break;
			}
			case 3: {
				String s="Neurology".concat(".txt");
				File f1=new File(s);
				System.out.println("Available doctors");
				System.out.println("=====================================");
				System.out.println("Doctor Name"+"\t"+"Department\n");
				Read.displayDetails(f1, "Neurology");
				System.out.println("=====================================");
				System.out.println("\nselect the doctor:");
				try
				{
				String doctor=sc.next();
				Read.ReadM(doctor);
				System.out.println("\nSelect the available slots:");
				slot=sc.next();
				String doctorname=doctor.concat(".txt");
				File f=new File(doctorname);
				FileOperation.deleteLine(slot,f);
				useroption(slot, doctor, "Neurology");
				/*Doctor d=storage.Stroage.mapofDoctors.get(doctor);
				String doctorID=d.getdID();
				System.out.println(doctorID);*/
				}
				catch(Exception e)
				{
					System.out.println("Enter the correct option");
				}
				
				break;
			}
			case 4:
			{
				String s="Eye".concat(".txt");
				File f1=new File(s);
				System.out.println("Available doctors");
				System.out.println("=====================================");
				System.out.println("Doctor Name"+"\t"+"Department\n");
				Read.displayDetails(f1, "Eye");
				System.out.println("=====================================");
				System.out.println("\nselect the doctor:");
				try
				{
				String doctor=sc.next();
				Read.ReadM(doctor);
				System.out.println("\nSelect the available slots:");
				slot=sc.next();
				String doctorname=doctor.concat(".txt");
				File f=new File(doctorname);
				FileOperation.deleteLine(slot,f);
				useroption(slot, doctor, "Eye");
				/*Doctor d=storage.Stroage.mapofDoctors.get(doctor);
				String doctorID=d.getdID();
				System.out.println(doctorID);*/
				}
				catch(Exception e)
				{
					System.out.println("Enter the correct option");
				}
				
				break;
			}
			
			case 5:
			{
			
				mainclass1.Mainclass1.main(args);
				break;
			}
			
			default: {
				try {
					throw new InputMismatchException();
				} catch (InputMismatchException e) {
					System.out.println("Invalid choice");
					System.out.println("Please enter a correct option");
					main(args);
					break;
				}
			}
			}
		} catch (Exception e) {
			System.out.println("Invalid choice");
			System.out.println("Please enter a correct input, enter only numbers.");
			// main(args);
			 

		}
		}
		while(1>0);
	}

		
	}


