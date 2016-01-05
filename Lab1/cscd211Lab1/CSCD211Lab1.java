package cscd211Lab1;

import java.io.*;
import java.util.*;
import cscd211Utils.FileUtil;
import cscd211Utils.SortUtil;

/**
 * The provided class used to test your code.  This file will
 * not be changed!<br>
 * 
 * <br>NOTE: FileUtil and SortUtil are provided in the jar file;
 */

public class CSCD211Lab1
{
   public static void main(String [] args) throws Exception
   {
      File inf = null;
      int total, choice;
      Person [] myPeeps = null;
      Scanner kb = new Scanner(System.in), fin = null;
      
      inf = FileUtil.openInputFile(kb);
      fin = new Scanner(inf);
      total = FileUtil.countRecords(fin, 3);
      fin.close();
      
      fin = new Scanner(inf);
      myPeeps = CSCD211Lab1Methods.fillArray(fin, total);
      SortUtil.selectionSort(myPeeps);
      fin.close();
      
      do
      {
         choice = CSCD211Lab1Methods.menu(kb);
         
         if(choice == 1)
            CSCD211Lab1Methods.printArray(myPeeps);
         
         else if(choice == 2)
         {
            Color toFind = CSCD211Lab1Methods.readColor(kb);
            CSCD211Lab1Methods.displayAll(toFind, myPeeps);
         }// end choice == 2
         
         else if(choice == 3)
            Arrays.sort(myPeeps, new ColorSort());
         
         else if(choice == 4)
            Arrays.sort(myPeeps);
            
      }while(choice != 5);
   
   }// end main
      
}// end class 