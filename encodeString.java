import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String t="";

    int c=1;
    for(int i=0;i<s.length()-1;i++){
    if(s.charAt(i)!=s.charAt(i+1)){
      if(c==1)
      System.out.print(s.charAt(i));
      else{
        System.out.print(c+"*"+s.charAt(i));
        c=1;
      }
    }
    else{
      c++;
    }

    }
     if(c==1)
      System.out.print(s.charAt(s.length()-1));
      else{
        System.out.print(c+"*"+s.charAt(s.length()-1));
        c=1;
      }
    
   
  }
}
