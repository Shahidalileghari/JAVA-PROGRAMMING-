import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] element=new int[20];
        int pos=0;
        int neg=0;
        int even=0;
        int odd=0;
        int zero=0;
        System.out.println("Enter 20 element :");
        for(int i=0;i<20;i++)
        {
            element[i]=sc.nextInt();
            if(element[i]>0)
            {
                pos++;
            } else if (element[i]<0) {
               neg++;
            }
            else {
                zero++;
            }
            if(element[i]%2==0)
            {
                even++;
            }
            else if(element[i]%2!=0)
            {
                odd++;
            }
        }
        System.out.println("Positive:"+pos+"\nNegative:"+neg+"\nzero:"+zero+"\nEven:"+even+"\nOdd:"+odd);
    }
}
