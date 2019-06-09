import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String s=in.next();
    for(int i=s.length()-1;i>=0;i--){
      char c=s.charAt(i);
      if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
        System.out.print(c);
      }
    }
    
    
  }
}
