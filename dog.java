import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(Math.pow(2,(int)(Math.log(n)/Math.log(2)))==n)
    System.out.print("YES");
    else
    System.out.print("NO");
  }
}
