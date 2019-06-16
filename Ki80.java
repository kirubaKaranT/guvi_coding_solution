import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
  
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    Arrays.sort(arr);

int min=Integer.MAX_VALUE;

  for(int i=0;i<n-1;i++){
    if(arr[i+1]-arr[i]!=0&&arr[i+1]-arr[i]<min){
      min=arr[i+1]-arr[i];
    }
  }
    System.out.print(min);
    
  }
}
