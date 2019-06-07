import java.util.*;
import java.util.regex.*;
public class Main {
  static int[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int c=0;
    int n=in.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=in.next();
    }
    String pat=in.next();
    for(int i=0;i<n;i++){
      if(Pattern.matches((pat+"[1|0]*"),arr[i])){
        c++;
      }
    }
    System.out.print(c);
  }

}
