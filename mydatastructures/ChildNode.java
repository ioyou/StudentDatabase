
/**
 *Just made to illustrate UML diagrams with inheritance * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChildNode extends Node
{
    // instance variables - replace the example below with your own
    private int element;
    private Node next;

    /**
     * Constructor for objects of class Node
     */
    
    public ChildNode(int newElement, Node nextNode)
    {   this.element = newElement;
        this.next = nextNode;
    }
    
    public ChildNode()
     {
//         this.next= null;
//         
//         
         }
    /**
     * getElement method
     * 
     * @return     the data stored at this node 
     */
    public int getElement(){
        return this.element;
    }
    
    /**
     * getNext method
     * 
     * @return     the node this node points to 
     */
    public Node getNext(){
        return this.next;
    }
    
     /**
     * setNext method
     * 
     * @return     the node this node points to 
     */
    public void setNext(Node newNext){
        next = newNext;
    }
}
