import java.util.*;
import java.util.regex.*;
public class Main {
  public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   String s=in.next();
   int c=0;
   for(int i=0;i<s.length();i++){
   if(Pattern.matches("[a|b]*", s.charAt(i)+"")){
     
   }
   else{
     c++;
   }
   }
   if(c==0||c==1){
     System.out.print("yes");
   }
   else{
     System.out.print("no");
   }
  }
}
