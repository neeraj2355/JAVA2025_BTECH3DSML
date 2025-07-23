
import java.util.Scanner;
public class SimpleITR {
    void calculate()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        int p=sc.nextInt();
         System.out.println("Enter rate");
          int r=sc.nextInt();
          System.out.println("Enter Time");
          int t=sc.nextInt();
          int si=(p*r*t)/100;
          int amount=p+si;
          System.out.println("simple interest is="+si);
          System.out.println("Principal+Interest  is="+amount);
    }
    
    public static void main(String[] args) {
        SimpleITR ss=new SimpleITR();
        ss.calculate();
        
    }

    
}
