import java.util.Scanner;

public class Myalpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alphabat");
        String p=sc.next();
         char Alphabat=p.charAt(0);
         switch (Alphabat) 
         {
             case 'A':
             System.out.println("Vowel");
                 break;
             case 'a':
             System.out.println("Vowel");
                 break;
                 case 'E':
             System.out.println("Vowel");
                 break;
                 case 'I':
             System.out.println("Vowel");
                 break;
                 case 'O':
             System.out.println("Vowel");
                 break;
                 case 'U':
             System.out.println("Vowel");
                 break;
             default:
                 System.out.println("Consonents");
         }
    }
    
}
