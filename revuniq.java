import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String  s=in.next();
    HashSet<Character> hash=new HashSet<>();
    for(int i=s.length()-1;i>=0;i--){
      if(!hash.contains(s.charAt(i))){
      System.out.print(s.charAt(i));
      hash.add(s.charAt(i));
      
      }
    }
      
      
  }
}
