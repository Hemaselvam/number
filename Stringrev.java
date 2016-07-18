public class StringReverse{
   public static void main(String[] args){
      String s1="revathyviswa";
      String rev = new StringBuffer(s1). reverse().toString();
     
      System.out.println("\nString before rev: "+s1);
     
      System.out.println("String after rev: "+rev);
     
   }
}