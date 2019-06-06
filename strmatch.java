import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    boolean kk=false;
    for(int i=0;i<a.length()-1;i++){
      if(b.contains(a.substring(i,i+2))){
        kk=true;
      }
    }
    if(kk)
    System.out.print("yes");
    else
    System.out.print("no");
  
  }
}
