import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    
    for(int i=0;i<s.length();i++){
    if(i%3==0){
      System.out.print(s.charAt(i));
    }
    }
    
   
    
  }
  
}
