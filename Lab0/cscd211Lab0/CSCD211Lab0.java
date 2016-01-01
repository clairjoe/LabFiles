package cscd211Lab0;

import java.io.*;
import java.util.*;
import cscd211Utils.FileUtil;
import cscd211Utils.SortUtil;

public class CSCD211Lab0
{
   public static void main(String [] args) throws Exception
   {
      File inf = null;
      int total, choice;
      String [] words = null;
      Scanner kb = new Scanner(System.in), fin = null;
      
      inf = FileUtil.openInputFile(kb);
      fin = new Scanner(inf);
      total = FileUtil.countRecords(fin, 1);
      fin.close();
      
      fin = new Scanner(inf);
      words = CSCD211Lab0Methods.fillArray(fin, total);
      SortUtil.selectionSort(words);
      fin.close();
      
      CSCD211Lab0Methods.printArray(words, System.out);    
         
   }// end main
      
}// end class 