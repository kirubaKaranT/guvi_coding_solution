import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    long n=in.nextLong();
    if(n>=Integer.MIN_VALUE&&n<=Integer.MAX_VALUE){
      System.out.print("INT");
    }
    else{
      System.out.print("LONG");
    }
  }
}
