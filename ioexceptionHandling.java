import java.io.* ;
class ioexceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("Notpresent.txt");
            System.out.println(fr.read());
            fr.close();
        }   
        catch(IOException e)
        {
            System.out.println(e);
        }      
    }
}