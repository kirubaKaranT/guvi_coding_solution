import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
  int min=0;
    for(int i=0;i<n;i++){
      if(arr[i]<=k){
          min=arr[i];
      }
    }
    
    System.out.print(min);
    
      
  }
}
