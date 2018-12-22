package mainclass1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
	
	static String re=null;
	
	
	
	static void readdd(String d)
	{
		try 
		{
			String s=d.concat(".txt");
			File file = new File(s); 
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			//String string="";
			
			String line=br.readLine();
			
			
			while ((line = br.readLine()) != null) {
			    // Skip lines that are empty or only contain whitespace
			    if (line.trim().isEmpty()) {
			        continue;
			    }

			    String[] cells = line.split("\t");
			    
			    
			    
			   // System.out.println(cells.length);
			    System.out.println(line);
		}
		}
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void ReadFile(String s1)
	{
		String s=s1.concat(".txt");
		File file = new File(s); 
		  
		  try
		  {
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		  }
		  
		  catch(IOException e)
		  {
			  System.out.println("File not found");
			 // e.printStackTrace();
			  //main(args);
		  }
	}
	
	
	
	static void ReadM(String s1)
	{
		String s=s1.concat(".txt");
		File file = new File(s); 
			    Scanner sc;
				try {
					sc = new Scanner(file);
					 while (sc.hasNextLine()) 
					      System.out.print(sc.nextLine()+" "); 
				}
				catch (FileNotFoundException e) 
				{
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("File not found");
				} 
			  
			   
	}
	
	
	public static void displayDetails(File f,String s)
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
				//re=line;
				System.out.println(line);
			}
			line=br.readLine();
		}
		if(res==false)
		{
			 System.out.println("No details found, key does not exists !!");
		}	
	} catch (IOException e) {//FileNotFoundException | IOException e
		System.out.println("File does not found");
		e.printStackTrace();
		
			}
	
	//return re;
	}

 
  public static void main(String[] args)throws Exception 
  { 
  // We need to provide file path as the parameter: 
  // double backquote is to avoid compiler interpret words 
  // like \test as \t (ie. as a escape sequence) 
	  Scanner sc= new Scanner(System.in);
	 /* System.out.println("Enter the doctor name");
	  String s=sc.next();
	  String name=s.concat(".text");
	  System.out.println();*/
	  
  
  }
}