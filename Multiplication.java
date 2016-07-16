public class Multiplication {

   
    public static void main(String[] args) {
        int i,j,k;
        System.out.println("enter the no of table");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        for(j=1;j<=10;j++)
        {
            k=i*j;
            System.out.println(j+"*"+i+"="+k+"");
                    
        }
    }
}
