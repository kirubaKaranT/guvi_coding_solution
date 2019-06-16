import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
      int k=in.nextInt();
      if(k<0){
        sum+=k;
      }
    }
    System.out.print(sum);
  }
}
