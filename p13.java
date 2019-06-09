import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum=0;
    while(n>0){
     int  rem=n%10;
      sum+=Math.pow(rem,2);
      n/=10;
    }
    System.out.print(sum);
  }
}
