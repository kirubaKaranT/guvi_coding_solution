import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int l=in.nextInt();
    int r=in.nextInt();
    int count=0;
    for(int i=l;i<=r;i++){
      
      int sum=i;
      
      boolean prime=true;
      for(int j=2;j<sum;j++){
        if(sum%j==0){
         prime=false;
          break;
        }
      }
      if(prime)
      count++;
    }
    System.out.print(count);
  }
}
