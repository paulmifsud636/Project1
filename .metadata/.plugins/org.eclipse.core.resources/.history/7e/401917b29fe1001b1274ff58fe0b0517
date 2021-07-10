package Package;


import java.io.*;
import java.util.Scanner;

public class FilesList 
{
   	 static Scanner scanner = new Scanner( System.in);
          public void fileList() throws IOException 
          { 
        	  try 
        	  {
        		  // Takes user input of directory path 
        		  System.out.print("Enter directory path: ");
        		  String DirectoryPath = scanner.nextLine(); 	
        		  File path = new File(DirectoryPath);
     		    		
     
        		  File[] files = path.listFiles();
        		  for (File file : files) 
        		  {
        			  // Distinguish between directory and file
        			  if (file.isDirectory()) 
        			  {			 	
        				  System.out.print("directory:");
        			  } 
        			  else 
        			  {
        				  System.out.print("     file:");
        			  }
        			  // Prints out list of directories and files
        			  System.out.println(file.getCanonicalPath());	
        		  }
        		}
     	       catch (Exception e) 
        	  	{
     	    	   	System.err.print("... invalid directory input ... \n\n");
        	  	}
        }
}
    
     