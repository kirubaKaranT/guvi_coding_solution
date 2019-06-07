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

      System.out.print(Math.abs(find(in.nextInt())-find(in.nextInt())));
      
  }
public static int find(int k){
  for(int i=0;i<arr.length;i++){
    if(arr[i]==k){
      return i;
     
    }
  }
  return -1;
}
}
