public class JavaApplication31 {

    public static void main(String[] args) {
         {
         {
 
       
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2011, 07, 4, 6, 0, 0);
 
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2011, 07, 4, 7, 0, 0);
 
        
        long milliSec1 = cal1.getTimeInMillis();
        long milliSec2 = cal2.getTimeInMillis();
 
        long timeDifInMilliSec;
        if(milliSec1 >= milliSec2)
        {
            timeDifInMilliSec = milliSec1 - milliSec2;
        }
        else
        {
            timeDifInMilliSec = milliSec2 - milliSec1;
        }
 
        long timeDifSeconds = timeDifInMilliSec / 1000;
        long timeDifMinutes = timeDifInMilliSec / (60 * 1000);
        long timeDifHours = timeDifInMilliSec / (60 * 60 * 1000);
        
 
        System.out.println("Time differences");
       
        System.out.println(timeDifSeconds + " Seconds");
        System.out.println(timeDifMinutes + " Minutes");
        System.out.println(timeDifHours + " Hours");
       
         }
