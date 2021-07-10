package Package;

import java.io.File;
import java.util.Scanner;

public class AddFile 
{ 
	static Scanner sc = new Scanner(System.in);
		public void addFile() throws Exception 
		{
			try 
			{
				// Directory and file entry
		    	System.out.print("Enter directory path: ");  
				String path = sc.nextLine();
				System.out.print("Enter text file name: ");
				String file = sc.nextLine();
		  	   	
				// The complete file path
   	 	       	File newFile = new File(path +"/"+ file + ".txt");
   	 	       	if (newFile.createNewFile()) 
   	 	       	{
					System.out.println("File created: " + newFile.getName());
   	 	       	} 
   	 	       	else 
   	 	       	{
					System.err.println("... file already exists ... \n\n");
   	 	       	}	
	    	}		
	    	catch (Exception e) 
			{
			    System.err.print("... invalid directory path ... \n\n");
			}
		}
}
	    
