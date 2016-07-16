public class Reverse {

    
    public static void main(String[] args) {
         int num = 5678;
                int revnum = 0;
                int temp = 0;
               
                while(num > 0)
                {
                       
                      
                        temp = num%10;
                       
                        //create the reversed number
                        revnum = revnum * 10 + temp;
                        num = num/10;
                         
                }
               
                
                System.out.println("Reversed Number is: " + revnum);
        }
}
 