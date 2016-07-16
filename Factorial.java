public class Factorial {

   
    public static void main(String[] args) {
       int n,i;
       int fact=1;
       
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the factorial no:");
        n=sc.nextInt();
       
        for(i=1;i<=n;i++)
               fact=fact*i;
        {
            System.out.println("the factorial"+n+ "is"+fact);
        }
    }
    }

