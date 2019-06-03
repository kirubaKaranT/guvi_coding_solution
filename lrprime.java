import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int l=in.nextInt();
    int r=in.nextInt();
    int count=0;
    for(int i=l;i<=r;i++){
      int n=i;
      int sum=0;
      while(n>0){
        sum+=n%10;
        n/=10;
      }
      boolean prime=true;
      for(int j=2;j<sum;j++){
        if(sum%j==0){
         prime=false;
          break;
        }
      }
      if(prime&&sum!=1)
      count++;
    }
    System.out.print(count);
  }
}
