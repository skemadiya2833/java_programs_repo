import java.io.File;
import java.io.IOException; 
public class fileio 
{
    public static void main(String[] args) 
    {
        try 
        {
            File f = new File("e:file.txt");
            if(f.createNewFile())
            {
                System.out.println("File "+f.getName()+" is Created.");
            }
            else
            {
                System.out.println("Already Exist");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unexpected Error : "+e);
        }
    }
}
