import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   
    for(int i=1;i<=n;i++){
      if(n%i==0&&(n/i)%2==1){
        System.out.print(i);    
        System.exit(0);
      }
    }
    //System.out.print("no");
  }
}
