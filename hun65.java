import java.util.*;

public class Main {
  static int[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
     arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    boolean kk=true;
      for(int i=0;i<n;i++){
      if(arr[i]!=k){
      System.out.print(arr[i]+" ");
      kk=false;
      }}
      if(kk){
        System.out.print("empty");
      }
  }

}
