import java.util.Scanner;

class StringTest
{
    public static void main(String[] args)
    {
        char[] a = {'H','E','L','L','O'} ;
        String s1 = new String("Hell");
        String s2 = new String(a);
        String s3 = new String(s1);
        String s4 = "Hello" ;
        String s5 = "World" ;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("s1 = "+s1+" s2 = "+s2+" s3 = "+s3+" s4 = "+s4+" s5 = "+s5+" input = "+input);
        sc.close();
    }
}