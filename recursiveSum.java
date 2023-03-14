public class recursiveSum {
    public  static  int sum(int s)
    {
        if(s==1 || s<0)
            return 1;
        else
            return  s+sum(s-1);
    }
    public static  int fact(int number)
    {
        if(number<=0)
        {
            return  1;
        }
        return  number*fact(number-1);
    }
    public static  int fib(int number)
    {
        if(number<=0)
        {
            return 1;
        }
        return  fib(number-1)+fib(number-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(-5));
        System.out.println("Factorial:"+fact(5));
        System.out.println(fib(12));
    }
}
