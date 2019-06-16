import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int sum=0;
    int n=in.nextInt();
    while(n>0){
      int rem=n%10;
      if(rem%2==1){
        sum+=rem;
      }
      n=n/10;
    
    }
     if(sum%2==0)
     System.out.print("E");
     else
     System.out.print("O");
  }
}
