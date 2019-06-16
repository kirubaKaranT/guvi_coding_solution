import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    int k=in.nextInt();
    k=k%a.length();
    int pos=a.length()-k;
    for(int i=pos;i<a.length();i++){
    System.out.print(a.charAt(i));
    }
    for(int i=0;i<pos;i++)
     System.out.print(a.charAt(i));
    
    
      
  }
}
