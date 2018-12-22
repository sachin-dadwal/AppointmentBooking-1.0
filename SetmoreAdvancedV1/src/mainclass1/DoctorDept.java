package mainclass1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DoctorDept
{
	public static void doctorDept(String docdept, String name)
	{
		String dName=docdept.concat(".txt");
		//System.out.println(dName);
		
		File f1 = new File(dName);
		boolean empty = f1.length() == 0;
		if (empty) {
			try {
				f1.setWritable(true);
				FileWriter fw = new FileWriter(f1);
				FileOutputStream fo = new FileOutputStream(f1);
				fw.write("Doctor details Table\n\r");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write("Doctor Name"+"\t"+"Dept");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write(name + "\t\t" +docdept);
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
				fw = new FileWriter(dName, true);
				BufferedWriter bw = new BufferedWriter(fw);
				// bw.write("This is just to check how it is working");
				bw.newLine();
				fw.write("\n\r");
				fw.write("\n\r");
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t"+ dDept + "\t\t" + dDuration +"\t\t"+dStart+"\tto"+"\t"+dEnd+"\t\t"+dEMail+"\t\t"+dPhone);
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration +"\t\t\t"+dStart+"\tto"+dEnd+"\t\t"+dEMail+"\t\t"+dPhone);
				//fw.write(dID+"\t\t" + dName + "\t\t" + "$" + dCharge + "\t\t\t"+ dDept + "\t\t" + dDuration +"\t\t\t"+dStart+"\tto\t"+dEnd+"\t"+dEMail+"\t"+dPhone);
				fw.write(name + "\t\t" +docdept);			
				fw.write("\n\r");
				
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		doctorDept("ENT", "Rama");
		
	}

}
