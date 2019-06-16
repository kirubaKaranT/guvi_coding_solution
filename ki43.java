import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    boolean kk=false;
    for(int i=0;i<a.length()-b.length();i++){
      if(b.charAt(0)==a.charAt(i)){
        if(b.equals(a.substring(i,i+b.length()))){
          kk=true;
        }
      }
    }
    if(kk)
    System.out.println("yes");
    else
    System.out.println("no");
      
  }
}
