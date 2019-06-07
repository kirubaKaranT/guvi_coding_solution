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
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n-1;i++){
      
        for(int j=i+1;j<n;j++){
          if(arr[j]-arr[i]>max){
            max=arr[j]-arr[i];
          }
        }
      }
    

      System.out.print(max);
      
  }

}
