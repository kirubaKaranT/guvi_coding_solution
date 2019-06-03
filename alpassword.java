import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    if(a.length()<b.length()){
      for(int i=1;i<=b.length()-a.length();i++){
        a=a+i;
      }
    }
    else if(a.length()>b.length()){
      for(int i=1;i<=a.length()-b.length();i++){
        b=b+i;
      }
    }
    for(int i=0;i<a.length();i++)
    System.out.print(a.charAt(i)+""+b.charAt(i));
  }
}
