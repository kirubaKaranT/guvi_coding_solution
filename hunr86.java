import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
      int k=i;
      while(k>0){
        int rem=k%10;
        if(rem==2){
          c++;
        }
        k=k/10;
      }
    }
      System.out.print(c);
      
  }
}
