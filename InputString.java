import java.util.*;
class InputString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = sc.nextLine() ;
        System.out.println("Enter Second String");
        String s2 = sc.next() ;
        sc.close(); 
        boolean flag = false ;
        String[] arr = s1.split(" ");
        for(String s : arr)
        {
            if(s.equals(s2))
            {
                flag = true ;
                break ;
            }
        }
        System.out.println(flag+" "+s1.contains(s2));

        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));

    }
}