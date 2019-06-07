import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    boolean printed=true;
    int r=in.nextInt();
    
    for(int i=2;i<r;i++){
      int n=i;
      boolean prime=true;
      for(int j=2;j<n;j++){
        if(n%j==0){
         prime=false;
          break;
        }
      }
      if(prime){
      System.out.print(i+" ");
      printed =false;
      }
    }
    if(printed){
       System.out.print(0);
    }
  }
}
