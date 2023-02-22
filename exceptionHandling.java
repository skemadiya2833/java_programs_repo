class exceptionHandling
{
    public static void main(String[] args) throws ArithmeticException
    {
        int a = 10 ; 
        int b = 0 ;
        try
        {
            int c = a/b;
            System.out.println(c);
        }
        catch( Exception e)
        {
            System.out.println("divide by 0");
        }
        finally
        {
            System.out.println("Finally Block");
        }
        if(a > b)
        {
            throw new ArithmeticException("Invalid");
        }
    }
}