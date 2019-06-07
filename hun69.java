import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    boolean kk=true;
    int at=0,dot=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='@'){
        at++;
      }
      if(s.charAt(i)=='.'){
        dot++;
      }
    }

    if(s.contains("@")&&s.contains(".")){
      
      if(at==1&&dot==1&&s.substring(s.indexOf('@')+1,s.indexOf('.')).length()<=5&&s.substring(0,s.indexOf('@')).length()>=3&&".com".equals(s.substring(s.indexOf('.')))){
        System.out.print("YES");
        kk=false;
      }
    }
    if(kk){
      System.out.print("NO");
    }
  }
}
