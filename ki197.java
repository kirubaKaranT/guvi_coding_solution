import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      int k=in.nextInt();
      if(k>max){
        max=k;
      }
      if(k<min){
        min=k;
      }
    }
    System.out.print(max-min);
  }
}
