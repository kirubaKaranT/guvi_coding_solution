import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int res=1;
    int t=n;
    for(int i=0;i<k;i++){
      res=res*t--;
    }
    t=1;
    for(int i=0;i<k;i++){
      res=res/t++;
    }
    System.out.print(res);
    
  }
}
