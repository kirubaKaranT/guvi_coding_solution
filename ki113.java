import java.util.*;
import java.text.DateFormat.*;
import java.text.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    if(isDateValid(s))
System.out.print("yes");
else{
  System.out.print("no");
}
    
  }
  final static String DATE_FORMAT = "dd-MM-yyyy";

public static boolean isDateValid(String date) 
{
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
}
}
