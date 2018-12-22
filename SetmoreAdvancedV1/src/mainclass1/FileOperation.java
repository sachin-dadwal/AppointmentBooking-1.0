package mainclass1;


//Efficient Java program to perform file 
//operation output = input-delete 

import java.io.*; 
import java.util.HashSet; 

public class FileOperation 
{ 
	public static void deleteLine(String s,File f)
    {
        try
        {
                BufferedReader file = new BufferedReader(new FileReader(f));
                String line;
                String input = "\n";
                while ((line = file.readLine()) != null) 
                {
                   // System.out.println(line);
                	line.replaceAll("\n", "").replaceAll("\r", "");

                    if (!(line.contains(s)))
                    {
                        input += line +"\n\r";

//                        System.out.println("Line deleted.");
                    }
                   /* else
                    {
//                        input +=  "\t";

                    }*/
                }
                input.replaceAll("\n\r\n\r", "");
                FileOutputStream File = new FileOutputStream(f);
                File.write(input.getBytes());
                File.close();
        }
        catch (Exception e)
        {
                System.out.println("Problem reading file.");
        }
    } 
	public static void main(String[] args) {

		File f= new File("value1.txt");
		deleteLine("eNnIx", f);
//		Read.ReadFile("Doctor");
//		Read.ReadM("value");
	//	Read.ReadFile("value1");
		Read.readdd("value1");
		//Read.ReadM("value1");
		
		
	}
} 
