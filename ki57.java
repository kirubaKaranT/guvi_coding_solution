import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String t=in.next();
    char k=t.charAt(0);
     int c=0;
     for(int i=0;i<s.length();i++){
       if(s.charAt(i)==k){
         c++;
       }
     }
     System.out.print(c);
  }
}
