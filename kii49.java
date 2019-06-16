import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    long n=in.nextLong();
    if(n>=Integer.MIN_VALUE&&n<=Integer.MAX_VALUE){
      System.out.print("INT");
    }
    else if(n>=(-Math.pow(2,31)+1)&&n<=(Math.pow(2,31)+1)){
      System.out.print("LONG INT");
    }
    else{
      System.out.print("LONG LONG");
    }
  }
}
