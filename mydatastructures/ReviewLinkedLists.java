
/**
 * Write a description of class ReviewLinkedLists here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReviewLinkedLists
{
    public static void main(String [] args)
    {
        LinkedList myLL = new LinkedList();
        int element;
        Node tempNode;
        
        tempNode = myLL.getHead();
        myLL.addToEnd(1);
        myLL.addToEnd(8);
        myLL.addToEnd(28);
        myLL.addToEnd(38);
        myLL.printList();
    }
}
