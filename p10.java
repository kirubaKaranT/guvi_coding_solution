import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    if(a.length()!=b.length()){
      System.out.print("no");
    }
    else{
      int c=0;
      for(int i=0;i<a.length();i++){
        if(a.charAt(i)!=b.charAt(i)){
          c++;
        }
      }
      if(c<=1){
        System.out.print("yes");
      }
      else{
        System.out.print("no");
      }
    }
    
  }
}
