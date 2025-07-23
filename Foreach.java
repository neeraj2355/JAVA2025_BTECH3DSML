// write a java program to store 5 elements in the array and print them.
public class Foreach {// extended for loop
    public static void main(String[] args) {
        int p[]={10,2,3,4,5};
        System.out.println("Output using Normal For loop");

        for(int i=0;i<=4;i++) //Normal For loop
        { System.out.println(p[i]);
        }
        System.out.println("Output using Advanced: ForEach loop");

        for (int i : p) //Foreach loop
         {
       System.out.println(i);
        }
    }
    
}
