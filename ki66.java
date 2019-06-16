import java.util.*;

public class Main {
  
  
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int k=in.nextInt();
   int[] arr=new int[9999999];
    for(int i=0;i<n;i++){
    arr[in.nextInt()]++;
    }

    for(int i=0;i<arr.length;i++){
    
    if(arr[i]==k){
      System.out.print(i+" ");
    }

    }
  }
}
