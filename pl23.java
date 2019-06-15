import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int x1=in.nextInt();
    int y1=in.nextInt();
    int x2=in.nextInt(); 
    int y2=in.nextInt();
    int x3=in.nextInt();
    int y3=in.nextInt();
    if(x1==y1&&x2==y2&&x3==y3)
    System.out.print("yes");
    else if((x1==x2&&x2==x3)||(y1==y2&&y2==y3)) 
    System.out.print("yes");
    else
    System.out.print("no");
  
  }
}
