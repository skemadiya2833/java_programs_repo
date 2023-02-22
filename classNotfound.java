public class classNotfound
{
   public static void main(String[] args) 
   {
        try
        {
            Class.forName("hell");
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        } 
   }
}
