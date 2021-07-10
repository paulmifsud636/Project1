package Package;

import java.util.Scanner;

public class MainMenu 
{
	
	static Scanner in = new Scanner(System.in);
	public static String mainMenu() throws Exception
	{
		System.out.println("\n\n          ________________________________");
		System.out.println("Main menu ________________________________");
		System.out.println("          Directory explorer____________ 1");
		System.out.println("          File menu ____________________ 2");
		System.out.println("          Exit application _____________ 3");
		System.out.print("Please make a selection (1 to 3): ");

		String mainSelection =  in.next();
		
		//Main selection
		switch (mainSelection)
		{
			// List files
			case "1":  
				FilesList list=new FilesList();
				list.fileList();
				mainMenu();
				break;
				
			// Additional menu selection
			case "2":
			
					
				break;
			
			// Exit
			case "3":
				System.exit(0);
				break;
				
			// Default entry selection other than 1 to 3
			default:
				System.err.print(" ... invalid entry ... \n\n");
				break;
			}
			return mainSelection;
		}


			public static void main(String[] args) throws Exception 
			{
				@SuppressWarnings("unused")
				WelcomePage wp = new WelcomePage();
				WelcomePage.welcomePage();
				@SuppressWarnings("unused")
				String mm=mainMenu();
			}
}