import java.util.*;
import java.text.DateFormat.*;
import java.text.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String  a=in.next();
    for(int i=0;i<a.length();i++){
      if(i!=a.length()-1)
      System.out.print(a.charAt(i)+"-");
      else{
        System.out.print(a.charAt(i));
      }
    }
  }
}
