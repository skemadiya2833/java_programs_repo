import java.util.*;

public class question 
{
    public static void main(String[] args) 
    {
        String s = "abcdefgh1d$deknfk" ;
        char[] arr = s.toCharArray();
        List<Integer> li = new ArrayList<Integer>();
        List<String> tmp = new ArrayList<String>();
        String a = "";
        String ans = "";
        int index = 0 ;
        for(char ch : arr)
        {
            if(Character.isLetter(ch))
            {
                a = a + ch ;  
            }
            else
            {
                li.add(index) ;
                tmp.add(a);
                a = "";
            }
            index++ ;
        }
        index = 0;
        for(String t : tmp )
        {
            StringBuffer sb = new StringBuffer(t);
            ans += sb.reverse().toString();
            if(li.contains(index))
            {
                ans += arr[index];
            }
            index++ ;
        }
        System.out.println(ans);
    }
    
}
