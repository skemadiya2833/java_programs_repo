class Node
{
    int val ;
    Node next ;
}
public class nullpointer 
{
    public static void main(String[] args) 
    {
        try
        {
            Node n = new Node();
            n.val = 5 ;
            n.next = null ; 
            System.out.println(n.next.val);    
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}