public class Subsetarray {
 public static void main(String[] args) {
        
        Integer original[] = {1,2,3,9};
Integer input[] = {6,6};

if (Arrays.asList(original).containsAll(Arrays.asList(input)))
{
    System.out.println("Yup, they're in there!");
}
else
{
    System.out.println("no they are not subset");
}
        
    }
    
}