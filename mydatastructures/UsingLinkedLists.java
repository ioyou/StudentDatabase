

/**
 * Write a description of class UsingLinkedLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
   import java.util.*;

    public class UsingLinkedLists
   {
   
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
       public static void main (String [] args)
      {
         LinkedList myLL = new LinkedList ();
         boolean done;       // set to true when user wants to quit
         int menuChoice;
         int element;
         int val;
      
         done = false;
         while (!done)
         {
            Screen.print ("Here is the list so far: ");
            myLL.printList ();
            Screen.print ("\nChoose an operation on the list:");
            Screen.print ("    1.  Add an item.");
            Screen.print ("    2.  Delete an item.");
            Screen.print ("    3.  Find an item.");
            Screen.print ("	4.  Find and Insert after.");
            Screen.print ("    5.  Exit from this program.");
            Screen.print ("Enter the number of your choice:  ");
            menuChoice = Keyboard.readInt ();
         
         
         // Carry out the operation selected by the user.  For
         // items 1 to 3, get a string from the user and call
         // the appropriate method from the list.
         
            switch (menuChoice)
            {
               case 1:  // Insert an item.
                  Screen.print ("\nEnter value to be added:  ");
                  element = Keyboard.readInt ();
                  myLL.addToEnd (element);
                  Screen.print ("Done\n");
                  break;
               case 2:  // Delete an item.
                  Screen.print ("\nEnter the item to be deleted:  ");
                  element = Keyboard.readInt ();
                  if (myLL.delete (element))
                     Screen.print ("Done\n");
                  else
                     Screen.print ("Not found\n");
                  break;
               case 3:  // Check whether an item occurs in the list.
                  Screen.print ("\nEnter an item to find:  ");
                  element = Keyboard.readInt ();
                  if (myLL.find (element))
                     Screen.print ("Yes, that item is in the list.\n");
                  else
                     Screen.print ("No, that item is not in the list.\n");
                  break;
               case 4:
               	Screen.print("\nEnter an item to find:	 ");
               	element = Keyboard.readInt();
               	Screen.print("\nEnter # to insert after:	");
               	val = Keyboard.readInt();
               	
               	if(myLL.insert(element,val))
               		Screen.print("Yes, that item is in the list.\n and " + val + " was inserted after");
               	else
               		Screen.print("No, that item is not in the list.\n");
               	
               case 5:  // Exit from this program.
                  done = true;
                  Screen.print ("\nThe final trail is:  ");
                  Screen.print ("");
                  break;
               default:
                  Screen.print ("Illegal choice.");
                  break;
            } // end switch
         
         }
      
      
      
         System.out.println ("");
      
         myLL.printList ();
      
      }
   }
