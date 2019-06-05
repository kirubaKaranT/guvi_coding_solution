import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    
    int max=0,t=0;
    boolean a=true;
    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i)=='a'&&s.charAt(i+1)=='b'){
        t+=2;
        i+=1;
        if()
      }
      else{
        t=0;
      }
      if(t>max){
        max=t;
      }
    }
    
   if(s.contains("ab"))
     System.out.print(max);
    else{
      System.out.print(0);
    }
  }
}
