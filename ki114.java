import java.util.*;
import java.text.DateFormat.*;
import java.text.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
     int b=in.nextInt();
     int c=in.nextInt();
     System.out.print((int)Math.pow(a,b)%c);
  }
}
