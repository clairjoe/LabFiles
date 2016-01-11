package cscd211Lab3;

import java.io.*;
import java.util.*;
import cscd211Lab3.*;

/**
 * The provided class used to test your code.  This file will
 * not be changed!<br>
 * 
 * <br>NOTE: FileUtil and SortUtil are provided in the jar file;
 */
public class CSCD211Lab3
{
   private CSCD211Lab3(){}
	public static void main(String [] args)throws Exception
	{
      File dirName = null;
		int total, choice, files;
      File [] inFileNames = null;
		Scanner kb = new Scanner(System.in);
		ArrayList<Player> myPlayers = null;
      
      dirName = CSCD211Lab3Methods.readDirectoryName(kb);      
      inFileNames = CSCD211Lab3Methods.readDirectoryContents(dirName);
	   
      myPlayers = CSCD211Lab3Methods.readPlayers(inFileNames);  
      
		do
		{
			choice = CSCD211Lab3Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  CSCD211Lab3Methods.printList(myPlayers, System.out);
                     break;
                     
            case 2:  String fileName = CSCD211Lab3Methods.readFileName(kb);
                     PrintStream fout = new PrintStream(new FileOutputStream(fileName), true);
                     CSCD211Lab3Methods.printList(myPlayers, fout);
                     fout.close();
                     break;
                     
            case 3:  Collections.sort(myPlayers);
                     break;
                     
            case 4:  Collections.sort(myPlayers, new TeamSort());
                     break;
            
            case 5:  Collections.sort(myPlayers, new PositionSort());
                     break;
                     
            case 6:  CSCD211Lab3Methods.removePlayer(myPlayers, kb);
                     break;
                     
            case 7:  CSCD211Lab3Methods.printTeamPlayers(myPlayers, kb);
                     break;
            
            default: System.out.println("Program Ending");
         }// end switch      
 
		}while (choice != 8);

	}// end main

}// end class