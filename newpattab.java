import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    
    int max=0,t=0;
    boolean a=true;
    for(int i=0;i<s.length();i++){
      if(a){
        if(s.charAt(i)=='a'){
          t++;
          a=false;
        }
        else{
          t=0;
          a=true;
        }

      }
      else{
        if(s.charAt(i)=='b'){
          t++;
          a=true;
        }
        else{
          t=0;
          a=true;
        }
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
