package Package;

import java.io.File;
import java.util.Scanner;

public class DeleteFile 
{
	static Scanner sc = new Scanner(System.in);
		public static void deleteFile() throws Exception
		{
			// Directory and file data entry
			System.out.print("Enter directory path: ");  
			String path = sc.nextLine();
			System.out.print("Enter text file name: ");
			String fileName = sc.nextLine();
			
			// File path
			File file = new File(path +"\\"+ fileName + ".txt");
			file.toString();
		
			// Paths are compared (case sensitive) before deletion
		if ((file.getCanonicalPath()).contentEquals((String)(path +"\\"+ fileName + ".txt"))) 
			{
				file.delete();
				System.out.println(file.getName() + " was deleted. ");
			}
		else
			{
				System.err.println(" ... file not found ...case sensitive ... (C:\\ + directory + file) ...  \n\n");
			}   	 
	}    
}










