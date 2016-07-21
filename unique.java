public static void main(String[] args) 
    {
 
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int[] a=new int[b];
    for(int i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(int i=0;i<b-1;i++)
     {
         for(int j=i+1;j<b;j++)
         {
             if(a[i]==a[j])
             {
                 a[j]=' ';

             a[i]=' ';
             }
         }
         
     }
  

    for(int i=0;i<b;i++)
        { 
            if(a[i]!=' ')
            System.out.print(""+a[i]);
        }
    }
}