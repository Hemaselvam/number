import java.util.Scanner;



public class Vowels {

   
    public static void main(String[] args) {
        
        char c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a character");
        c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println(c+"is an vowel");
        }else
        {
            System.out.println(c+"is an consonants");
        }
        
        
    }
}
