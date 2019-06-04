import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int sum=0;
    for(int i=n-1;i>=0;i--){
      for(int j=i-1;j>=0;j--){
        if(arr[i]>arr[j]){
          
          sum+=arr[j];
         // System.out.println(arr[k]);
        }
        
      }
    }
    System.out.print(sum);
  }
}
