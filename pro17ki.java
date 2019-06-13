import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
     a[i]=in.nextInt();
    }

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]+a[j]==k){
          System.out.print("yes");
          System.exit(0);
        }
      }
    }
    System.out.print("no");
      
  }
}
