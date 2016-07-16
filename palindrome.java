public class Palindrome {

   
    public static void main(String[] args) {
         System.out.print("Enter Number: ");
       Scanner read = new Scanner(System.in);
       int num = read.nextInt();
       int n = num;
       
       int i=0,r; 
       while(num > 0) 
       { 
         r = num % 10; 
         i = i * 10 + r; 
         num = num / 10; 
       } 
       if(i == n) 
         System.out.println(n+" is a Palindrome Number!"); 
       else
         System.out.println(n+" is not a Palindrome Number!"); 
     } 
        
    }
