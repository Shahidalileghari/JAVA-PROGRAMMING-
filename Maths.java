public class Maths {
    public static int divide(int x,int y){
        int R=x;
        int q=0;
        while (R<=y)
        {
            R=R-y;
            q=q+1;
        }
        return  q;
    }
    public static void main(String[] args) {


        int x=90,y=7;
        System.out.println("Actual :"+x/y);
        System.out.println("Manual:"+divide(x,y));
    }
}
