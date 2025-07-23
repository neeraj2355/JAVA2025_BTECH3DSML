class One
{   public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);//unboxing
          String name=args[1];
          float Percentage=Float.parseFloat(args[4]);
        System.out.println("Input is="+age +"of"+ name+Percentage);
        if(age>=18)
        {
            System.out.println("Allowed For Voting");
        }
        else
        {
            System.out.println("Not Allowed For Voting");
        }
        
    }
}