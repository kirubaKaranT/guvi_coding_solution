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
    
    for(int i=0;i<n-1;i++){
      int max=arr[i+1];
        for(int j=i+1;j<n;j++){
          if(arr[j]>max){
            max=arr[j];
          }
        }
        arr[i]=max;
      }
      arr[n-1]=0;
      for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
      
  }

}
