import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String t=in.next();
    s=s.toLowerCase();
    t=t.toLowerCase();
     int i=0,j=0;
     while(i<s.length()&&j<t.length()){
       if(s.charAt(i)!=t.charAt(j)){
         break;
       }
       i++;j++;
     }
     if(i==s.length()){
      System.out.print("yes") ;
     } 
     else{
       System.out.print("no") ;
     }
  }
}
