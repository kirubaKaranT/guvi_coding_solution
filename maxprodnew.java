import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++)
   arr[i]=in.nextInt();
   int prod=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      prod=1;
      for(int j=i;j<n;j++){
        prod*=arr[j];
        if(prod>max){
          max=prod;
        }
      }
    }

      System.out.println(max);
      
  }
}
