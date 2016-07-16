public class Leap {

    
    public static void main(String[] args) {
        int n,i=4;
        System.err.println("enter the yr");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(i%4==0)
        {
            System.out.println("the given yr is leap year");
        }
        else
        {
            System.out.println("the given yr is not a leap year");
        }
    }
}