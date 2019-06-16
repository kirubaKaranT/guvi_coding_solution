import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int pow=((int)(Math.log(n)/Math.log(k)));
    if(n==Math.pow(k,pow))
    System.out.println("yes");
    else
    System.out.println("no");
      
  }
}
