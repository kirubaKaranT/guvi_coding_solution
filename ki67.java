import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.print(fac(n));
 }
 public static int fac(int n){
if(n==0||n==1){
  return 1;
}
return fac(n-1)*n;


 }

  
}
