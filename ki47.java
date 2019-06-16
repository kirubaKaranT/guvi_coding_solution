import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    if(a!=0&&b!=0&&c!=0){
      if(a+b+c==180){
        System.out.print("yes");
     System.exit(0);
      }
    }

      System.out.print("no");
  }
}
