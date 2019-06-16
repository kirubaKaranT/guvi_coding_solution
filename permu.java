import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    
    System.out.print(fac(n)/fac(n-k));
    
  }
  public static int fac(int n){
    if(n==0||n==1){
      return 1;
    }
    return n*fac(n-1);
  }
}
