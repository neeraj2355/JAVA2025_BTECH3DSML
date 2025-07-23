
import java.util.*;
public class Myinput {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);//Readymade class
        String myname=sc.next();// methods
        System.out.println("Your name="+myname);
        System.out.println("Enter your Age");
        int myage=sc.nextInt();
        System.out.println("Your Age is="+myage);
        System.out.println("Enter your percentage");
        double pr=sc.nextDouble();
        System.out.println("Your Percentrage is="+pr);
        
    }
    
}
