class StringMethods
{
    public static void main(String[] args)
    {
        String s1 = "Hell" ;
        String s2 = "Heaven" ;
        String s3 = "         Trailing white spaces" ;
        
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s1.replace("e","i"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(2));
        System.out.println(s1.charAt(1));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s3.trim());
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}