import java.util.*;
import java.text.DateFormat.*;
import java.text.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String  a=in.next();
     String b=in.next();
     int c=Math.min(a.length(),b.length());
    System.out.print(a.substring(0,c)+b.substring(0,c));
     
  }
}
