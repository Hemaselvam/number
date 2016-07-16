public class PositiveNo {

    
    public static void main(String[] args) {
       int i;
       Scanner sc =new Scanner(System.in);
       i=sc.nextInt();
       if(i>0)
       {
           System.out.println("Positive no");
       } else if(i==0)
       {
           System.out.println("Zero");
       }
       else 
               {
                   System.out.println("Negative no");
               }
    }

}
