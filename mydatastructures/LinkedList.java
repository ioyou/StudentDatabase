
/**
 * Write a description of class LinkedList here.
 * 
 * @author (E. Teevan, modified by J. Van Kesteren) 
 * @version (May 2011)
 */
    public class LinkedList
   {
      protected Node head;
      protected Node tail;
    /**
     * Constructor for objects of class LinkedList
     */
       public LinkedList()
      {
      }
   
   
       public Node getHead()
      {
         return head;
      }
   
       public Node getTail()
      {
         return tail;
      }
   
        
    /**
     * @param element value sought
     * @return True if the element is found
     */
       public boolean find(int element)
      {
         Node pointer = head;
      
         // Keep looking while the pointer is at an existing node and is not at the sought node
         while (pointer != null && pointer.getElement()!=element)
         { 
            pointer = pointer.getNext();
         }
         if (pointer == null)
            return false;
         else
            return true;
      }// close find method
    
    
       public boolean delete(int element)
      {   
         Node pointer = head;                                    // pointer to trace through the nodes
         Node pointerMinusOne = null;                            // node before the pointer
               
         // Keep looking while the pointer is at a real clue is not at the sought riddle
         while (pointer != null && pointer.getElement()!=element)
         {
            pointerMinusOne = pointer;
            pointer = pointer.getNext();
         }
        
         // Value to delete was not found
         if (pointer == null)
         {  Screen.print("Pointer NOT found!")  ;
            return false;     
         }
         // Value was found
         else
         {  // Value was the first in the list
            if (pointerMinusOne == null)        
            {   
               head = pointer.getNext();                       // Second element is now the first element
            }
            else
            {  
               pointerMinusOne.setNext(pointer.getNext());     // Element before deleted one now points to one after
              
            }
            return true;
         }     
      } // Close delete method
   
       public void addToEnd(int newElement)
      {   
         Node temp = new Node (newElement, null);
                 
         // If the list is empty the new item will be first
         if (head == null)
         {
            head = temp;
            
            
            tail = temp;
            Screen.print("Press any key to continue.");
            Keyboard.readString();
         
         }
         else
         {  
            tail.setNext(temp);
            tail = temp;
            Screen.print("Press any key to continue.");
            Keyboard.readString();
         
         }
         
         
      }// close addToEnd method
      
       public boolean insert (int element, int insertVal)
      {
         Node pointer = head;
      
         // Keep looking while the pointer is at an existing node and is not at the sought node
         while (pointer != null && pointer.getElement()!=element)
         { 
            pointer = pointer.getNext();
         }
         if (pointer == null)
            return false;
         else
         {
            Node temp = new Node (insertVal,pointer.getNext());
            //temp.setNext(temp.getNext());
            pointer.setNext(temp);
            return true;
         }
                 
      } 
      
       public void printList()
      {   
         Node temp = head;
         while (temp != null)
         {  Screen.print(""+temp.getElement());
            temp = temp.getNext();
         }
      
      }// close printList method
   }
