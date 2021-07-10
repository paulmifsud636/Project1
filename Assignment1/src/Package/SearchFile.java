package Package;

import java.io.*;
import java.util.Scanner;

public class SearchFile
{
	static Scanner sc = new Scanner(System.in);
		public void searchFile() throws Exception 
		{
		try 
			{	
				// Directory and file data entries
				System.out.print("Enter directory path: ");  			
				String path = sc.nextLine();						
				System.out.print("Enter text file name: ");
				String fileName = sc.nextLine();
						
				// The complete file path
				File file = new File(path +"/"+ fileName + ".txt");
				file.toString();
							
				// Paths are compared - case sensitive
				if ((file.getCanonicalPath()).contentEquals((String)(path +"\\"+ fileName + ".txt")))  
					{
				      try 
				        	{
				        		// If paths are equal (case sensitive), than related text file is opened/read.
				       		 	Scanner sc = new Scanner(file);
				       		 	System.out.println("________________________________________________________________________ \n");
				       		 	
				       		 	// File read/printed
				       		 	while (sc.hasNextLine()) 
				       		 	{
				        		 System.out.println(sc.nextLine());
				        		 }
				        		 sc.close();        				  	    				        
				        	 }				 
			    	   catch (FileNotFoundException e) 
						  	{
			    	    		System.err.println(" ... file not found ...case sensitive ... (C:\\ + directory + file) ...  \n\n");
						  	}
				      finally 
						 	{ 					
						 		System.out.println("________________________________________________________________________ \n");
						 	}
				       	} 
				else
						{
				        		 System.err.println(" ... file not found ...case sensitive ... (C:\\ + directory + file) ...  \n\n");
				    	 }
				       }
			catch (Exception e)
				{
					System.err.println(" ... file not found ...case sensitive ... (C:\\ + directory + file) ...  \n\n");
				}
		}
}
			





	