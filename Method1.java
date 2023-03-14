public class Method1 {
    public int max(int a, int b, int c)

    {
        if(a>b && a>c)
        {
            return  a;
        } else if (b>a &&b>c) {
            return  b;
        }
    return  c;
    }
    public int min(int a, int b, int c)

    {
        if(a<b && a<c)
        {
            return  a;
        } else if (b<a &&b<c) {
            return  b;
        }
        return  c;
    }
    public static void main(String[] args) {
     Method1 m=new Method1();
        int max=m.max(12,43,67);
        int min= m.min(12,43,67);
        System.out.println("Maximum number :"+max);
        System.out.println("Minimum number :"+min);
    }
}
