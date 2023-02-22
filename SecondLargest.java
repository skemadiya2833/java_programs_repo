import java.util.* ;
public class SecondLargest 
{
    public static void main(String[] args)
    {
        int[] nums =new int[10] ;
        for(int i = 0 ; i  < 10 ; i++)
        {
            nums[i] = i * 5 ;
        }
        int max = nums[0] ;
        int prvsmax = max ;
        for(int i = 0 ; i < nums.length ; i++ )
        {
            if(max < nums[i] )
            {
                System.out.print("i = "+i+" prvsmax = "+prvsmax+" max= "+max);
                prvsmax = max ;
                max = nums[i] ;
            }
        }
        System.out.println("   "+prvsmax+"  max= "+max);
    }   
}