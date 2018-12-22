package mainclass1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DoctorD {
	public static void File(String dID, String dName, String dCharge, String dDept, int dDuration, String dEMail, String dPhone, String dStart, String dEnd)
	{
	/*System.out.println("Doctor :" + dName);
	System.out.println("Appointment charge: $" + dCharge);
	System.out.println("Working hours: " + dStart + " to " + dEnd + ".");
	System.out.println("Appointment duration: " + dDuration + " minutes.\n");
	System.out.println("Phone number"+dPhone);
	System.out.println("Email address:"+dEMail);
	System.out.println("Department :"+dDept);*/
		File f1 = new File("Doctor.txt");
		boolean empty = f1.length() == 0;
		if (empty) {
			try {
				f1.setWritable(true);
				FileWriter fw = new FileWriter(f1);
				FileOutputStream fo = new FileOutputStream(f1);
				fw.write("Doctor details Table\n\r");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration"+"\t\t"+"Working Hours"+"\t\t"+"Email"+"\t\t"+"Phone");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write(dID+"\t\t" + dName + "\t\t" + "$ " + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration+ "mins." +"\t\t\t"+dStart+"\tto  "+dEnd+"\t\t"+dEMail+"\t"+dPhone);
				//fw.write("\n\r");
				//fw.write("\n\r");
				fw.flush();
				fw.close();
				// System.out.println("Content written sucessfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			FileWriter fw;
			try {
				fw = new FileWriter("Doctor.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				// bw.write("This is just to check how it is working");
				bw.newLine();
				fw.write("\n\r");
				fw.write("\n\r");
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t"+ dDept + "\t\t" + dDuration +"\t\t"+dStart+"\tto"+"\t"+dEnd+"\t\t"+dEMail+"\t\t"+dPhone);
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration +"\t\t\t"+dStart+"\tto"+dEnd+"\t\t"+dEMail+"\t\t"+dPhone);
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration +"\t\t\t"+dStart+"\tto\t"+dEnd+"\t"+dEMail+"\t"+dPhone);
				fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration +"\t\t\t"+dStart+"\tto  "+dEnd+"\t\t"+dEMail+"\t"+dPhone);
				fw.write("\n\r");
				
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}

}
