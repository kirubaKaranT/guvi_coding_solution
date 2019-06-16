import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        System.out.print(s.charAt(i));
      }

    }
    for(int i=0;i<s.length();i++){
      if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')){
        System.out.print(s.charAt(i));
      }
    }
    
  }
}
