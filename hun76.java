import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    n=n*n;
     float sum=0;
    for(int i=0;i<n;i++){
     sum+=in.nextFloat();
    }
    System.out.printf("%f",(sum/n));   
  }
}
