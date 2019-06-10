import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    s=s.toLowerCase();
    boolean odd=true;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        if(odd){
          System.out.print(((""+s.charAt(i)).toUpperCase()));
          odd=false;
        }
        else{
          odd=true;
           System.out.print(s.charAt(i));
        }
      }
      else{
      System.out.print(s.charAt(i));
      }
    }
      
    
  }
}
