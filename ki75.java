import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
    int[] arr=new int[n];
    int max=0;
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }

    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
          max++;
        }
      }

    }    
    System.out.print(max);
      
    
    
  }
}
