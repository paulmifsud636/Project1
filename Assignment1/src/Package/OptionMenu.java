package Package;

import java.util.Scanner;

public class OptionMenu 
{
	public static void wait(int ms)
	{
		// Delay related to menu presentation
	    try							
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}
	
		static Scanner in= new Scanner(System.in);
		public static String optionMenu() throws Exception{
		
		System.out.println("          ________________________________");
		System.out.println("File menu ________________________________");
		System.out.println("          Search and open a txt file ___ 1");
		System.out.println("          Add a new txt file ___________ 2");
		System.out.println("          Delete a txt file ____________ 3");
		System.out.println("          Back to main menu ____________ 4");
		System.out.println("          Exit application _____________ 5");
		System.out.print("Please make a selection (1 to 5): ");
		
		String optionSelection=in.next();

		//Option selection
		switch(optionSelection) 
		{	
			// Search and open a file
			case "1":
				SearchFile sf = new SearchFile();
				sf.searchFile();
				wait(100);
				OptionMenu.optionMenu();
			break;
			
			// Add a file
			case "2":
				AddFile af= new AddFile ();
				af.addFile();
				wait(100);
				OptionMenu.optionMenu();
			break; 
			
			// Delete a file
			case "3":
				@SuppressWarnings("unused") 
				DeleteFile delete= new DeleteFile();
				DeleteFile.deleteFile();
				wait(100);
				OptionMenu.optionMenu();
			break;
			
			// Return to main menu
			case "4":
				@SuppressWarnings("unused") 
				MainMenu mm=new MainMenu();
				wait(100);
				MainMenu.mainMenu();
			break;
			
			// Exit
			case "5":
				System.exit(0);
			break;
					
			// Default selection other from 1 to 5
			default:
				System.err.print(" ... invalid entry ... \n\n");
				wait(100);
				OptionMenu.optionMenu();
			break;
		}
		return optionSelection;
	}
}