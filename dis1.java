import java.util.*;

public class Main {
  static int[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
     arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int min=Integer.MAX_VALUE;
     
    int u=in.nextInt();
    int v=in.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==u){
        for(int j=0;j<n;j++){
          if(arr[j]==v){
            min=Math.min(Math.abs(i-j),min);
          }
        }
      }
    }

      System.out.print(min);
      
  }

}
