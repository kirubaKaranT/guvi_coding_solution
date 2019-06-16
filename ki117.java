import java.util.*;
import java.text.DateFormat.*;
import java.text.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String  a=in.next();
    for(int i=a.length()-1;i>=0;i--){
      if(i!=0)
      System.out.print(a.charAt(i)+"-");
      else{
        System.out.print(a.charAt(i));
      }
    }
  }
}
