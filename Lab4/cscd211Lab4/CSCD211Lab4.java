package cscd211Lab4;

import java.util.Scanner;
import cscd211Misc.*;
import cscd211LinkedList.*;


public class CSCD211Lab4
{
   public static void main(String [] args)throws Exception
   {
      BoxCar aCar = null;
      boolean res =  false;
      Comparable item = null;
      int choice = 0, result = 0, index = 0;
      Scanner kb = new Scanner(System.in);
      
      LinkedList myList = new LinkedList();
      
      do
      {
         choice = Lab4Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  System.out.println(myList);
                     break;
                     
            case 2:  aCar = Lab4Methods.createBoxCar(kb);
                     myList.addFirst(aCar);
                     break;
            
            case 3:  aCar = Lab4Methods.createBoxCar(kb);
                     myList.addLast(aCar);
                     break;
            
            case 4:  aCar = Lab4Methods.createBoxCar(kb);
                     index = Lab4Methods.readIndex(kb);
                     myList.add(index, aCar);
                     break;

            case 5:  aCar = Lab4Methods.createBoxCar(kb);
                     res = myList.contains(aCar);
                     System.out.println("The results of contains " + res);
                     break;

            case 6:  aCar = Lab4Methods.createBoxCar(kb);
                     result = myList.indexOf(aCar);
                     System.out.println("The results of indexOf " + result);
                     break;

            case 7:  item = myList.removeFirst();
                     System.out.println("The results of remove " + item);
                     break;

            case 8:  item = myList.removeLast();
                     System.out.println("The results of remove " + item);
                     break;

            case 9:  index = Lab4Methods.readIndex(kb);
                     item = myList.remove(index);
                     System.out.println("The results of remove " + item);
                     break;

            case 10: aCar = Lab4Methods.createBoxCar(kb);
                     res = myList.removeFirstOccurrence(aCar);
                     System.out.println("The results of contains " + res);
                     break;
                     
            case 11: aCar = Lab4Methods.createBoxCar(kb);
                     res = myList.removeLastOccurrence(aCar);
                     System.out.println("The results of contains " + res);
                     break;
                     
            case 12: myList.clear();
                     break;
                     
            case 13: System.out.println("List size: " + myList.size());
                     break;            

            default: System.out.println("Program ending");
         
         }// end switch
      
      }while(choice != 14);
   
   }// end main

}// end class