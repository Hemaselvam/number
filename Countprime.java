public class JavaApplication30 {

    
    public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int input = sc.nextInt();
  int count = 0;
  for (int i = 2; i < input; i++)
 {
boolean isPrimeNumber = true;
for (int j=2; j<i;j++)
 {
   if (i%j== 0) {
   isPrimeNumber = false;
   break; 
    }
  }
  if (isPrimeNumber)
 {
   count++;
   System.out.print(i + ", ");
}
}
  System.out.println("Count: " + count);
    }
}
