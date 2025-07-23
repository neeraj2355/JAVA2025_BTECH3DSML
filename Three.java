import java.util.Scanner;
class Three
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
         System.out.println("Enter Second Number");
        int b=sc.nextInt();
         System.out.println("Enter Third Number");
        int c=sc.nextInt();
        if(a>b &&a>c)
        {
            System.out.println("First Number is largest");
        }
        else if(b>a && b>c )
        {
            System.out.println("Second Number is largest");
        }
        else
        {
            System.out.println("Third Number is largest");
        } 
        
    }
}