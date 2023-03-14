import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
       int sum=0;
       int count=0;
       int product=1;
       String choice="";
       Scanner sc=new Scanner(System.in);
       while (!choice.equals("q"))
       {
           System.out.println("Enter a number or q to quite");
           choice=sc.next();
           if(!choice.equals("q"))
           {
               int number=Integer.parseInt(choice);
               sum=sum+number;
               product=product*number;
               count++;
           }
       }
        System.out.println("Sum :"+sum+"\nAverage:"+(float)sum/count);
    }
}
